import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.util.concurrent.TimeUnit;
import javax.swing.JTextField;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalExclusionType;

public class MorseApp extends JFrame {

	private JPanel contentPane;
	private JTextField sentenceField;
	private JTextField morseCodeField;
	private JTextField saveAsField;
	private JTextField txtField;

	String a = new String();
	char x[] = new char[100];

	String morsA = "res/wavs/A.wav";
	String morsB = "res/wavs/B.wav";
	String morsC = "res/wavs/C.wav";
	String morsD = "res/wavs/D.wav";
	String morsE = "res/wavs/E.wav";
	String morsF = "res/wavs/F.wav";
	String morsG = "res/wavs/G.wav";
	String morsH = "res/wavs/H.wav";
	String morsI = "res/wavs/I.wav";
	String morsJ = "res/wavs/J.wav";
	String morsK = "res/wavs/K.wav";
	String morsL = "res/wavs/L.wav";
	String morsM = "res/wavs/M.wav";
	String morsN = "res/wavs/N.wav";
	String morsO = "res/wavs/O.wav";
	String morsP = "res/wavs/P.wav";
	String morsQ = "res/wavs/Q.wav";
	String morsR = "res/wavs/R.wav";
	String morsS = "res/wavs/S.wav";
	String morsT = "res/wavs/T.wav";
	String morsU = "res/wavs/U.wav";
	String morsV = "res/wavs/V.wav";
	String morsW = "res/wavs/W.wav";
	String morsX = "res/wavs/X.wav";
	String morsY = "res/wavs/Y.wav";
	String morsZ = "res/wavs/Z.wav";

	void delay() {

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

	}

	void playMusic(String musicLocation) {

		try {

			File musicPath = new File(musicLocation);
			if (musicPath.exists()) {
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
				Clip clip = AudioSystem.getClip();
				clip.open(audioInput);
				clip.start();
			} else {
				System.out.println("Can't find file");
			}

		} catch (Exception ex) {

			ex.printStackTrace();

		}

	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MorseApp frame = new MorseApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MorseApp() {
		setResizable(false);
		setBackground(Color.WHITE);
		setTitle("MORSE ALPHABET TRANSLATER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel sentenceLabel = new JLabel("SENTENCE :");
		sentenceLabel.setForeground(Color.BLACK);
		sentenceLabel.setBackground(Color.WHITE);
		sentenceLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		sentenceLabel.setBounds(16, 250, 120, 30);
		contentPane.add(sentenceLabel);

		sentenceField = new JTextField();
		sentenceField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		sentenceField.setBounds(176, 250, 550, 30);
		contentPane.add(sentenceField);
		sentenceField.setColumns(10);

		JButton VoiceAndTextTranslateButton = new JButton("VOICE AND TEXT TRANSLATE");
		VoiceAndTextTranslateButton.setBackground(Color.WHITE);
		VoiceAndTextTranslateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				a = sentenceField.getText();
				char x[] = new char[100];
				for (int i = 0; i < a.length(); i++) {
					x[i] = a.charAt(i);
				}

				for (int i = 0; i < x.length; i++) {

					if (x[i] == 'a' || x[i] == 'A') {
						morseCodeField.setText(morseCodeField.getText() + " .- ");
						playMusic(morsA);
						delay();

					}
					if (x[i] == 'b' || x[i] == 'B') {
						morseCodeField.setText(morseCodeField.getText() + " -... ");
						playMusic(morsB);
						delay();
					}
					if (x[i] == 'c' || x[i] == 'C') {
						morseCodeField.setText(morseCodeField.getText() + " -.-. ");
						playMusic(morsC);
						delay();
					}
					if (x[i] == 'd' || x[i] == 'D') {
						morseCodeField.setText(morseCodeField.getText() + " -.. ");
						playMusic(morsD);
						delay();
					}
					if (x[i] == 'e' || x[i] == 'E') {
						morseCodeField.setText(morseCodeField.getText() + " . ");
						playMusic(morsE);
						delay();
					}
					if (x[i] == 'f' || x[i] == 'F') {
						morseCodeField.setText(morseCodeField.getText() + " ..-. ");
						playMusic(morsF);
						delay();
					}
					if (x[i] == 'g' || x[i] == 'G') {
						morseCodeField.setText(morseCodeField.getText() + " --. ");
						playMusic(morsG);
						delay();
					}
					if (x[i] == 'h' || x[i] == 'H') {
						morseCodeField.setText(morseCodeField.getText() + " .... ");
						playMusic(morsH);
						delay();
					}
					if (x[i] == 'i' || x[i] == 'I') {
						morseCodeField.setText(morseCodeField.getText() + " .. ");
						playMusic(morsI);
						delay();
					}
					if (x[i] == 'j' || x[i] == 'J') {
						morseCodeField.setText(morseCodeField.getText() + " .--- ");
						playMusic(morsJ);
						delay();
					}
					if (x[i] == 'k' || x[i] == 'K') {
						morseCodeField.setText(morseCodeField.getText() + " -.- ");
						playMusic(morsK);
						delay();
					}
					if (x[i] == 'l' || x[i] == 'L') {
						morseCodeField.setText(morseCodeField.getText() + " .-.. ");
						playMusic(morsL);
						delay();
					}
					if (x[i] == 'm' || x[i] == 'M') {
						morseCodeField.setText(morseCodeField.getText() + " -- ");
						playMusic(morsM);
						delay();
					}
					if (x[i] == 'n' || x[i] == 'N') {
						morseCodeField.setText(morseCodeField.getText() + " -. ");
						playMusic(morsN);
						delay();
					}
					if (x[i] == 'o' || x[i] == 'O') {
						morseCodeField.setText(morseCodeField.getText() + " --- ");
						playMusic(morsO);
						delay();
					}
					if (x[i] == 'p' || x[i] == 'P') {
						morseCodeField.setText(morseCodeField.getText() + " .--. ");
						playMusic(morsP);
						delay();
					}
					if (x[i] == 'q' || x[i] == 'Q') {
						morseCodeField.setText(morseCodeField.getText() + " --.- ");
						playMusic(morsQ);
						delay();
					}
					if (x[i] == 'r' || x[i] == 'R') {
						morseCodeField.setText(morseCodeField.getText() + " .-. ");
						playMusic(morsR);
						delay();
					}
					if (x[i] == 's' || x[i] == 'S') {
						morseCodeField.setText(morseCodeField.getText() + " ... ");
						playMusic(morsS);
						delay();
					}
					if (x[i] == 't' || x[i] == 'T') {
						morseCodeField.setText(morseCodeField.getText() + " - ");
						playMusic(morsT);
						delay();
					}
					if (x[i] == 'u' || x[i] == 'U') {
						morseCodeField.setText(morseCodeField.getText() + " ..- ");
						playMusic(morsU);
						delay();
					}
					if (x[i] == 'v' || x[i] == 'V') {
						morseCodeField.setText(morseCodeField.getText() + " ...- ");
						playMusic(morsV);
						delay();
					}
					if (x[i] == 'w' || x[i] == 'W') {
						morseCodeField.setText(morseCodeField.getText() + " .-- ");
						playMusic(morsW);
						delay();
					}
					if (x[i] == 'x' || x[i] == 'X') {
						morseCodeField.setText(morseCodeField.getText() + " -..- ");
						playMusic(morsX);
						delay();
					}
					if (x[i] == 'y' || x[i] == 'Y') {
						morseCodeField.setText(morseCodeField.getText() + " -.-- ");
						playMusic(morsY);
						delay();
					}
					if (x[i] == 'z' || x[i] == 'Z') {
						morseCodeField.setText(morseCodeField.getText() + " --.. ");
						playMusic(morsZ);
						delay();
					}
					if (x[i] == ' ') {
						morseCodeField.setText(morseCodeField.getText() + "  ");
						delay();
						delay();
					}

				}

			}
		});
		VoiceAndTextTranslateButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		VoiceAndTextTranslateButton.setBounds(176, 330, 550, 30);
		contentPane.add(VoiceAndTextTranslateButton);

		JButton btnClearAll = new JButton("CLEAR ALL");
		btnClearAll.setBackground(Color.WHITE);
		btnClearAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sentenceField.setText("");
				morseCodeField.setText("");
				saveAsField.setText("");
			}
		});
		btnClearAll.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnClearAll.setBounds(436, 673, 140, 30);
		contentPane.add(btnClearAll);

		JLabel MorseCodeLabel = new JLabel("MORSE CODE :");
		MorseCodeLabel.setForeground(Color.BLACK);
		MorseCodeLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		MorseCodeLabel.setBackground(Color.WHITE);
		MorseCodeLabel.setBounds(16, 475, 150, 30);
		contentPane.add(MorseCodeLabel);

		morseCodeField = new JTextField();
		morseCodeField.setEditable(false);
		morseCodeField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		morseCodeField.setColumns(10);
		morseCodeField.setBounds(176, 475, 550, 30);
		contentPane.add(morseCodeField);

		JButton btnExit = new JButton("EX\u0130T");
		btnExit.setBackground(Color.WHITE);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnExit.setBounds(586, 673, 140, 30);
		contentPane.add(btnExit);

		JLabel titleLabel1 = new JLabel("MORSE ALPHABET TRANSLATER");
		titleLabel1.setFont(new Font("Tahoma", Font.BOLD, 30));
		titleLabel1.setBounds(123, 50, 490, 45);
		contentPane.add(titleLabel1);

		JLabel titleLabel2 = new JLabel("(FOR ONLY 26 MA\u0130N CHARACTER)");
		titleLabel2.setFont(new Font("Tahoma", Font.BOLD, 20));
		titleLabel2.setBounds(195, 100, 345, 45);
		contentPane.add(titleLabel2);

		JButton SaveTheMorseCodeAsButton = new JButton("SAVE THE MORSE CODE AS");
		SaveTheMorseCodeAsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String myString = new String();
				myString = saveAsField.getText();

				try {

					File myFile = new File("res/txts/" + myString + ".txt");

					if (myFile.createNewFile()) {

						FileWriter fileWriter = new FileWriter(myFile, false);
						BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

						bufferedWriter.write(morseCodeField.getText());
						bufferedWriter.close();

						JOptionPane.showMessageDialog(null, "MORSE CODE TXT CREATED: " + myFile.getName());

					} else {
						JOptionPane.showMessageDialog(null, "TXT NAME ALREADY EXISTS, PLEASE CHOOSE ANOTHER TXT NAME");
					}

				} catch (IOException ex) {
					System.out.println("An error occurred.");
					ex.printStackTrace();
				}

			}
		});
		SaveTheMorseCodeAsButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		SaveTheMorseCodeAsButton.setBackground(Color.WHITE);
		SaveTheMorseCodeAsButton.setBounds(176, 515, 300, 30);
		contentPane.add(SaveTheMorseCodeAsButton);

		JButton VoicetranslateButton = new JButton("VOICE TRANSLATE");
		VoicetranslateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				a = sentenceField.getText();
				char x[] = new char[100];
				for (int i = 0; i < a.length(); i++) {
					x[i] = a.charAt(i);
				}

				for (int i = 0; i < x.length; i++) {

					if (x[i] == 'a' || x[i] == 'A') {
						playMusic(morsA);
						delay();

					}
					if (x[i] == 'b' || x[i] == 'B') {
						playMusic(morsB);
						delay();
					}
					if (x[i] == 'c' || x[i] == 'C') {
						playMusic(morsC);
						delay();
					}
					if (x[i] == 'd' || x[i] == 'D') {
						playMusic(morsD);
						delay();
					}
					if (x[i] == 'e' || x[i] == 'E') {
						playMusic(morsE);
						delay();
					}
					if (x[i] == 'f' || x[i] == 'F') {
						playMusic(morsF);
						delay();
					}
					if (x[i] == 'g' || x[i] == 'G') {
						playMusic(morsG);
						delay();
					}
					if (x[i] == 'h' || x[i] == 'H') {
						playMusic(morsH);
						delay();
					}
					if (x[i] == 'i' || x[i] == 'I') {
						playMusic(morsI);
						delay();
					}
					if (x[i] == 'j' || x[i] == 'J') {
						playMusic(morsJ);
						delay();
					}
					if (x[i] == 'k' || x[i] == 'K') {
						playMusic(morsK);
						delay();
					}
					if (x[i] == 'l' || x[i] == 'L') {
						playMusic(morsL);
						delay();
					}
					if (x[i] == 'm' || x[i] == 'M') {
						playMusic(morsM);
						delay();
					}
					if (x[i] == 'n' || x[i] == 'N') {
						playMusic(morsN);
						delay();
					}
					if (x[i] == 'o' || x[i] == 'O') {
						playMusic(morsO);
						delay();
					}
					if (x[i] == 'p' || x[i] == 'P') {
						playMusic(morsP);
						delay();
					}
					if (x[i] == 'q' || x[i] == 'Q') {
						playMusic(morsQ);
						delay();
					}
					if (x[i] == 'r' || x[i] == 'R') {
						playMusic(morsR);
						delay();
					}
					if (x[i] == 's' || x[i] == 'S') {
						playMusic(morsS);
						delay();
					}
					if (x[i] == 't' || x[i] == 'T') {
						playMusic(morsT);
						delay();
					}
					if (x[i] == 'u' || x[i] == 'U') {
						playMusic(morsU);
						delay();
					}
					if (x[i] == 'v' || x[i] == 'V') {
						playMusic(morsV);
						delay();
					}
					if (x[i] == 'w' || x[i] == 'W') {
						playMusic(morsW);
						delay();
					}
					if (x[i] == 'x' || x[i] == 'X') {
						playMusic(morsX);
						delay();
					}
					if (x[i] == 'y' || x[i] == 'Y') {
						playMusic(morsY);
						delay();
					}
					if (x[i] == 'z' || x[i] == 'Z') {
						playMusic(morsZ);
						delay();
					}
					if (x[i] == ' ') {
						delay();
						delay();
					}

				}

			}
		});
		VoicetranslateButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		VoicetranslateButton.setBackground(Color.WHITE);
		VoicetranslateButton.setBounds(176, 290, 250, 30);
		contentPane.add(VoicetranslateButton);

		JButton TextTranslateButton = new JButton("TEXT TRANSLATE");
		TextTranslateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				a = sentenceField.getText();
				char x[] = new char[100];
				for (int i = 0; i < a.length(); i++) {
					x[i] = a.charAt(i);
				}

				for (int i = 0; i < x.length; i++) {

					if (x[i] == 'a' || x[i] == 'A') {
						morseCodeField.setText(morseCodeField.getText() + " .- ");
					}
					if (x[i] == 'b' || x[i] == 'B') {
						morseCodeField.setText(morseCodeField.getText() + " -... ");
					}
					if (x[i] == 'c' || x[i] == 'C') {
						morseCodeField.setText(morseCodeField.getText() + " -.-. ");
					}
					if (x[i] == 'd' || x[i] == 'D') {
						morseCodeField.setText(morseCodeField.getText() + " -.. ");
					}
					if (x[i] == 'e' || x[i] == 'E') {
						morseCodeField.setText(morseCodeField.getText() + " . ");
					}
					if (x[i] == 'f' || x[i] == 'F') {
						morseCodeField.setText(morseCodeField.getText() + " ..-. ");
					}
					if (x[i] == 'g' || x[i] == 'G') {
						morseCodeField.setText(morseCodeField.getText() + " --. ");
					}
					if (x[i] == 'h' || x[i] == 'H') {
						morseCodeField.setText(morseCodeField.getText() + " .... ");
					}
					if (x[i] == 'i' || x[i] == 'I') {
						morseCodeField.setText(morseCodeField.getText() + " .. ");
					}
					if (x[i] == 'j' || x[i] == 'J') {
						morseCodeField.setText(morseCodeField.getText() + " .--- ");
					}
					if (x[i] == 'k' || x[i] == 'K') {
						morseCodeField.setText(morseCodeField.getText() + " -.- ");
					}
					if (x[i] == 'l' || x[i] == 'L') {
						morseCodeField.setText(morseCodeField.getText() + " .-.. ");
					}
					if (x[i] == 'm' || x[i] == 'M') {
						morseCodeField.setText(morseCodeField.getText() + " -- ");
					}
					if (x[i] == 'n' || x[i] == 'N') {
						morseCodeField.setText(morseCodeField.getText() + " -. ");
					}
					if (x[i] == 'o' || x[i] == 'O') {
						morseCodeField.setText(morseCodeField.getText() + " --- ");
					}
					if (x[i] == 'p' || x[i] == 'P') {
						morseCodeField.setText(morseCodeField.getText() + " .--. ");
					}
					if (x[i] == 'q' || x[i] == 'Q') {
						morseCodeField.setText(morseCodeField.getText() + " --.- ");
					}
					if (x[i] == 'r' || x[i] == 'R') {
						morseCodeField.setText(morseCodeField.getText() + " .-. ");
					}
					if (x[i] == 's' || x[i] == 'S') {
						morseCodeField.setText(morseCodeField.getText() + " ... ");
					}
					if (x[i] == 't' || x[i] == 'T') {
						morseCodeField.setText(morseCodeField.getText() + " - ");
					}
					if (x[i] == 'u' || x[i] == 'U') {
						morseCodeField.setText(morseCodeField.getText() + " ..- ");
					}
					if (x[i] == 'v' || x[i] == 'V') {
						morseCodeField.setText(morseCodeField.getText() + " ...- ");
					}
					if (x[i] == 'w' || x[i] == 'W') {
						morseCodeField.setText(morseCodeField.getText() + " .-- ");
					}
					if (x[i] == 'x' || x[i] == 'X') {
						morseCodeField.setText(morseCodeField.getText() + " -..- ");
					}
					if (x[i] == 'y' || x[i] == 'Y') {
						morseCodeField.setText(morseCodeField.getText() + " -.-- ");
					}
					if (x[i] == 'z' || x[i] == 'Z') {
						morseCodeField.setText(morseCodeField.getText() + " --.. ");
					}
					if (x[i] == ' ') {
						morseCodeField.setText(morseCodeField.getText() + "  ");
					}

				}

			}
		});

		TextTranslateButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TextTranslateButton.setBackground(Color.WHITE);
		TextTranslateButton.setBounds(476, 290, 250, 30);
		contentPane.add(TextTranslateButton);

		saveAsField = new JTextField();
		saveAsField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		saveAsField.setBounds(486, 515, 190, 30);
		contentPane.add(saveAsField);
		saveAsField.setColumns(10);

		txtField = new JTextField();
		txtField.setEditable(false);
		txtField.setText(".txt");
		txtField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtField.setColumns(10);
		txtField.setBounds(676, 515, 50, 30);
		contentPane.add(txtField);

		JButton red = new JButton("");
		red.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.RED);
			}
		});
		red.setBackground(Color.RED);
		red.setBounds(81, 688, 15, 15);
		contentPane.add(red);

		JButton orange = new JButton("");
		orange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.ORANGE);
			}
		});
		orange.setBackground(Color.ORANGE);
		orange.setBounds(96, 688, 15, 15);
		contentPane.add(orange);

		JButton yellow = new JButton("");
		yellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.YELLOW);
			}
		});
		yellow.setBackground(Color.YELLOW);
		yellow.setBounds(111, 688, 15, 15);
		contentPane.add(yellow);

		JButton green = new JButton("");
		green.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.GREEN);
			}
		});
		green.setBackground(Color.GREEN);
		green.setBounds(126, 688, 15, 15);
		contentPane.add(green);

		JButton blue = new JButton("");
		blue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.BLUE);
			}
		});
		blue.setBackground(Color.BLUE);
		blue.setBounds(141, 688, 15, 15);
		contentPane.add(blue);

		JButton cyan = new JButton("");
		cyan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.CYAN);
			}
		});
		cyan.setBackground(Color.CYAN);
		cyan.setBounds(156, 688, 15, 15);
		contentPane.add(cyan);

		JButton magenta = new JButton("");
		magenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.MAGENTA);
			}
		});
		magenta.setBackground(Color.MAGENTA);
		magenta.setBounds(171, 688, 15, 15);
		contentPane.add(magenta);

		JButton white = new JButton("");
		white.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.WHITE);
			}
		});
		white.setBackground(Color.WHITE);
		white.setBounds(186, 688, 15, 15);
		contentPane.add(white);

		JLabel lblNewLabel = new JLabel("BG COLOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel.setBounds(16, 688, 55, 15);
		contentPane.add(lblNewLabel);
	}
}
