package donations.server;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import donations.serialization.User;

import donations.util.DonationException;
import donations.util.WindowManager;

public class DonationManager implements ActionListener, Runnable {

	private JFrame frame;
	private JButton buttonEnd;
	private JLabel usernameField;
	private JLabel passwordField;
	private JLabel message;

	private Client client;
	private WebTarget webTarget;

	private Thread thread;
	private final AtomicBoolean running = new AtomicBoolean(false);

	public DonationManager(String hostname, String port) {
		client = ClientBuilder.newClient();
		webTarget = client.target(String.format("http://%s:%s/rest", hostname, port));

		this.buttonEnd = new JButton("Finish login test ");
		this.buttonEnd.addActionListener(this);
		this.usernameField = new JLabel("username: ");
		this.passwordField = new JLabel("pass: ");
		this.message = new JLabel("LOGIN STARTING");
		this.message.setOpaque(true);
		this.message.setForeground(Color.yellow);
		this.message.setBackground(Color.gray);

		JPanel panelSuperior = new JPanel();
		panelSuperior.add(new JLabel("User: "));
		panelSuperior.add(this.usernameField);
		panelSuperior.add(new JLabel("Password: "));
		panelSuperior.add(this.passwordField);

		JPanel panelBoton = new JPanel();
		panelBoton.add(this.buttonEnd);

		this.frame = new JFrame("Donation Collector: RMI Manager");
		this.frame.setSize(475, 140);
		this.frame.setResizable(false);		
		this.frame.getContentPane().add(panelSuperior, "North");
		this.frame.getContentPane().add(panelBoton);
		this.frame.getContentPane().add(this.message, "South");
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		WindowManager.middleCenter(this.frame);
		this.frame.setVisible(true);

		thread = new Thread(this);
		thread.start();
	}

	public void actionPerformed(ActionEvent e) {
		JButton target = (JButton)e.getSource();
		if (target == this.buttonEnd) {
			this.stop();
			System.exit(0);
		}
	}

	public User getUserInfo() throws DonationException {
		WebTarget donationsWebTarget = webTarget.path("collector/donations");
		Invocation.Builder invocationBuilder = donationsWebTarget.request(MediaType.APPLICATION_JSON);
		Response response = invocationBuilder.get();
		if (response.getStatus() == Status.OK.getStatusCode()) {
			User user = response.readEntity(User.class);
			this.usernameField.setText(user.getUsername());
			this.passwordField.setText(user.getPassword());
			this.message.setText("username: "+user.getUsername()+ " password: "+user.getPassword());
			return user;
		} else {
			throw new DonationException("" + response.getStatus());
		}
	}

	public void run() {
		running.set(true);
		while(running.get()) {
			try { 
				Thread.sleep(2000);
				System.out.println("Obtaining data from server...");
				try {
					User user = getUserInfo();
					this.usernameField.setText(user.getUsername());
					this.passwordField.setText(user.getPassword());
				} catch (DonationException e) {
					System.out.println(e.getMessage());
				}
            } catch (InterruptedException e){ 
                Thread.currentThread().interrupt();
                System.out.println("Thread was interrupted, Failed to complete operation");
            }
		}
	}

	public void stop() {
		this.running.set(false);
	}

	public static void main(String[] args) {
		String hostname = args[0];
		String port = args[1];

		DonationManager donationManager = new DonationManager(hostname, port);
	}
}