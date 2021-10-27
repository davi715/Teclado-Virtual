
package treinoteclado;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.Timer;



public class Teclado extends javax.swing.JFrame {


	public Teclado() {
		initComponents();
		setLocationRelativeTo(null);
		t = new Timer(10, acoes);
	}
	private Timer t;
	private int m, s, cs;
	private ActionListener acoes = new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent ae) {
			++cs; 
			if(cs==100){
				cs = 0; 
				++s;    
			}
			if(s==60) 
			{
				s = 0; 
				++m;   
			}
			atualizacaoCronometro(); 
			verificacaoCronometro(); 

		}
	};


	private void atualizacaoCronometro() {
		String tempo = (m<=9?"0":"")+m+":"+(s<=9?"0":"")+s+":"+(cs<=9?"0":"")+cs;
		Cronometro.setText(tempo); 
	}

	double letra_certa=0.0;
	double letra_errada=0.0;
	int letra_q = 0;
	int i = 0;
	int fase = 1;



	List <String> frase1 = Arrays.asList("Juiz faz com que whisky de malte baixe logo preço de venda. ", 
			"TV faz quengo explodir com whisky JB. ",
			"Jane quer LP, fax, CD, giz, TV e bom whisky. ",
			"Blitz prende ex-vesgo com cheque fajuto. ",
			"Um pequeno jabuti xereta viu dez cegonhas felizes. ");

	List <String> frase2 = Arrays.asList("Zafrield exporta Whisky, vinho, queijo, caju, manga e nabo. ",
			"A DOUTORA CUIDOU DE PACIENTES COM ZIKA,CHICUNGUNHA,BALANITE,QUELITE,WERNER,XANTOMA E YERSINIA. ",
			"Veja o extravagante salto da raposa sobre o cachorro que dorme feliz. ",
			"Gazeta publica hoje no jornal uma breve nota de faxina na quermesse. ",
			"Zebras caolhas de Java querem passar fax para moças gigantes de New York. ");

	List <String> frase3 = Arrays.asList("Gafanhotos azuis celebram a pequena terra das jovens bruxas. ",
			"Jovem craque belga prediz falhas no xote. ",
			"Veja sempre o lado dos homens que se queixam pelos gastos que fazem nos cubos. ");


	char [] pan1 = (frase1.get(new Random().nextInt(frase1.size()))).toCharArray();





	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		LetraW = new javax.swing.JButton();
		LetraE = new javax.swing.JButton();
		LetraR = new javax.swing.JButton();
		LetraT = new javax.swing.JButton();
		LetraY = new javax.swing.JButton();
		LetraU = new javax.swing.JButton();
		LetraI = new javax.swing.JButton();
		LetraO = new javax.swing.JButton();
		LetraP = new javax.swing.JButton();
		back = new javax.swing.JButton();
		LetraA = new javax.swing.JButton();
		LetraS = new javax.swing.JButton();
		LetraK = new javax.swing.JButton();
		LetraJ = new javax.swing.JButton();
		LetraH = new javax.swing.JButton();
		LetraD = new javax.swing.JButton();
		LetraF = new javax.swing.JButton();
		LetraG = new javax.swing.JButton();
		LetraL = new javax.swing.JButton();
		LetraA = new javax.swing.JButton();
		enter = new javax.swing.JButton();
		LetraZ = new javax.swing.JButton();
		LetraX = new javax.swing.JButton();
		LetraC = new javax.swing.JButton();
		LetraV = new javax.swing.JButton();
		LetraB = new javax.swing.JButton();
		LetraN = new javax.swing.JButton();
		LetraM = new javax.swing.JButton();
		Virgula = new javax.swing.JButton();
		Ponto = new javax.swing.JButton();
		spaco = new javax.swing.JButton();
		caps = new javax.swing.JButton();
		shift = new javax.swing.JButton();
		LetraQ = new javax.swing.JButton();
		ifen = new javax.swing.JButton();
		ctrl = new javax.swing.JButton();
		Alt = new javax.swing.JButton();
		Tab = new javax.swing.JButton();
		aspa = new javax.swing.JButton();
		Num1 = new javax.swing.JButton();
		Num2 = new javax.swing.JButton();
		Num3 = new javax.swing.JButton();
		Num4 = new javax.swing.JButton();
		Num5 = new javax.swing.JButton();
		Num6 = new javax.swing.JButton();
		Num7 = new javax.swing.JButton();
		Num8 = new javax.swing.JButton();
		Num9 = new javax.swing.JButton();
		igual = new javax.swing.JButton();
		Num0 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		TextArea = new javax.swing.JTextArea();
		Acerto = new javax.swing.JLabel();
		Titulo = new javax.swing.JLabel();
		Pangrama = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		erros = new javax.swing.JLabel();
		LetraPressionada = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		ProxLetra = new javax.swing.JLabel();
		Jfase = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		Cronometro = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		//jPanel1.setSize(500, 500);
		//jLabel1.setSize(500,500);


		jLabel1.setFont(new java.awt.Font("Arial", 0, 18));
		jLabel1.setText("Aplicação de digitação");

		LetraW.setText("W");
		LetraW.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LetraWActionPerformed(evt);
			}
		});

		LetraE.setText("E");
		LetraE.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LetraEActionPerformed(evt);
			}
		});

		LetraR.setText("R");
		LetraR.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LetraRActionPerformed(evt);
			}
		});

		LetraT.setText("T");
		LetraT.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LetraTActionPerformed(evt);
			}
		});

		LetraY.setText("Y");
		LetraY.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LetraYActionPerformed(evt);
			}
		});

		LetraU.setText("U");
		LetraU.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LetraUActionPerformed(evt);
			}
		});

		LetraI.setText("I");
		LetraI.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LetraIActionPerformed(evt);
			}
		});

		LetraO.setText("O");
		LetraO.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LetraOActionPerformed(evt);
			}
		});

		LetraP.setText("P");
		LetraP.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LetraPActionPerformed(evt);
			}
		});

		back.setText("BACKSPACE");
		back.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				backActionPerformed(evt);
			}
		});

		LetraA.setText("A");
		LetraA.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LetraAActionPerformed(evt);
			}
		});

		LetraS.setText("S");
		LetraS.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LetraSActionPerformed(evt);
			}
		});

		LetraK.setText("K");
		LetraK.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LetraKActionPerformed(evt);
			}
		});

		LetraJ.setText("J");
		LetraJ.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LetraJActionPerformed(evt);
			}
		});

		LetraH.setText("H");
		LetraH.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LetraHActionPerformed(evt);
			}
		});

		LetraD.setText("D");
		LetraD.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LetraDActionPerformed(evt);
			}
		});

		LetraF.setText("F");
		LetraF.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LetraFActionPerformed(evt);
			}
		});

		LetraG.setText("G");
		LetraG.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LetraGActionPerformed(evt);
			}
		});

		LetraL.setText("L");
		LetraL.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LetraLActionPerformed(evt);
			}
		});

		LetraA.setText("A");
		LetraA.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LetraAActionPerformed(evt);
			}
		});

		enter.setText("ENTER");

		LetraZ.setText("Z");
		LetraZ.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LetraZActionPerformed(evt);
			}
		});

		LetraX.setText("X");
		LetraX.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LetraXActionPerformed(evt);
			}
		});

		LetraC.setText("C");
		LetraC.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LetraCActionPerformed(evt);
			}
		});

		LetraV.setText("V");
		LetraV.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LetraVActionPerformed(evt);
			}
		});

		LetraB.setText("B");
		LetraB.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LetraBActionPerformed(evt);
			}
		});

		LetraN.setText("N");
		LetraN.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LetraNActionPerformed(evt);
			}
		});

		LetraM.setText("M");
		LetraM.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LetraMActionPerformed(evt);
			}
		});

		Virgula.setText(",");
		Virgula.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				VirgulaActionPerformed(evt);
			}
		});

		Ponto.setText(".");
		Ponto.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				PontoActionPerformed(evt);
			}
		});

		spaco.setText("SPACE");

		caps.setText("CAPS");

		shift.setText("SHIFT");
		shift.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				shiftActionPerformed(evt);
			}
		});

		LetraQ.setText("Q");
		LetraQ.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LetraQActionPerformed(evt);
			}
		});

		ifen.setText("-");

		ctrl.setText("Ctrl");
		ctrl.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ctrlActionPerformed(evt);
			}
		});

		Alt.setText("Alt");

		Tab.setText("TAB");

		aspa.setText("'");
		aspa.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				aspaActionPerformed(evt);
			}
		});

		Num1.setText("1");
		Num1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Num1ActionPerformed(evt);
			}
		});

		Num2.setText("2");
		Num2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Num2ActionPerformed(evt);
			}
		});

		Num3.setText("3");
		Num3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Num3ActionPerformed(evt);
			}
		});

		Num4.setText("4");
		Num4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Num4ActionPerformed(evt);
			}
		});

		Num5.setText("5");
		Num5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Num5ActionPerformed(evt);
			}
		});

		Num6.setText("6");
		Num6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Num6ActionPerformed(evt);
			}
		});

		Num7.setText("7");
		Num7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Num7ActionPerformed(evt);
			}
		});

		Num8.setText("8");
		Num8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Num8ActionPerformed(evt);
			}
		});

		Num9.setText("9");
		Num9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Num9ActionPerformed(evt);
			}
		});

		igual.setText("=");
		igual.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				igualActionPerformed(evt);
			}
		});

		Num0.setText("0");
		Num0.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Num0ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);



		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(shift, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(LetraZ, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(LetraX, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(LetraC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(LetraV, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(LetraB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(LetraN, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(LetraM, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(Virgula, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(Ponto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addComponent(aspa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(Num1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(Num2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(Num3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(Num4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(Num5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(Num6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(Num7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(Num8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(Num9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(Num0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(ifen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																.addGroup(jPanel1Layout.createSequentialGroup()
																		.addComponent(Tab, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(LetraQ, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
																.addComponent(ctrl, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																.addGroup(jPanel1Layout.createSequentialGroup()
																		.addGap(12, 12, 12)
																		.addComponent(Alt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(spaco, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGroup(jPanel1Layout.createSequentialGroup()
																		.addComponent(LetraW, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(LetraE, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(LetraR, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(LetraT, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(LetraY, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(LetraU, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(LetraI, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(LetraO, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(LetraP, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addComponent(caps, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(LetraA, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(LetraS, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(LetraD, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(LetraF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(LetraG, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(LetraH, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(LetraJ, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(LetraK, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(LetraL, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(LetraA, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
				);



		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGap(16, 16, 16)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(ifen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Num0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Num9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Num8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Num7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Num6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Num5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Num4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Num3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Num2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Num1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(aspa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(Tab, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(LetraQ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(LetraW, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(LetraE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(LetraR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(LetraT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(LetraY, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(LetraU, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(LetraI, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(LetraO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(LetraP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(caps, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(LetraA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(LetraS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(LetraD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(LetraF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(LetraG, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(LetraH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(LetraJ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(LetraK, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(LetraL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(LetraA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addComponent(enter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGap(6, 6, 6)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(shift, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(LetraZ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(LetraX, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(LetraC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(LetraV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(LetraB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(LetraN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(LetraM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Virgula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Ponto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(spaco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Alt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(ctrl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);

		TextArea.setColumns(20);
		TextArea.setFont(new java.awt.Font("Monospaced", 0, 18));
		TextArea.setRows(5);
		TextArea.setMaximumSize(new java.awt.Dimension(100, 9000));
		TextArea.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				TextAreaKeyPressed(evt);
			}
			public void keyReleased(java.awt.event.KeyEvent evt) {
				TextAreaKeyReleased(evt);
			}
		});
		jScrollPane1.setViewportView(TextArea);

		Acerto.setFont(new java.awt.Font("Tahoma", 0, 18)); 
		Acerto.setText("0");
		Acerto.setToolTipText("");

		Titulo.setFont(new java.awt.Font("Tahoma", 0, 18)); 
		Titulo.setText("Letra certa:");

		Pangrama.setFont(new java.awt.Font("Arial", 0, 18)); 
		Pangrama.setText(String.valueOf(pan1));
		Pangrama.setToolTipText("");

		jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); 
		jLabel2.setText("Letra errada:");

		erros.setFont(new java.awt.Font("Tahoma", 0, 18));
		erros.setText("0");

		LetraPressionada.setFont(new java.awt.Font("Tahoma", 0, 18));
		LetraPressionada.setText("Letra pressionada");

		jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); 
		jLabel3.setText("Proxima Letra:");

		ProxLetra.setFont(new java.awt.Font("Arial", 0, 18)); 
		ProxLetra.setText(String.valueOf(pan1[0]));

		Jfase.setFont(new java.awt.Font("Tahoma", 0, 18)); 
		Jfase.setText("1");

		jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); 
		jLabel4.setText("Fase:");

		Cronometro.setText("00:00:00");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGap(10, 10, 10)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addContainerGap())
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(layout.createSequentialGroup()
														.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(0, 0, 0)
														.addComponent(ProxLetra)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(LetraPressionada)))
										.addGap(37, 37, 37))
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(layout.createSequentialGroup()
														.addComponent(jLabel1)
														.addGap(324, 324, 324)
														.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
																.addGroup(layout.createSequentialGroup()
																		.addComponent(jLabel4)
																		.addGap(9, 9, 9)
																		.addComponent(Jfase, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
																.addComponent(Cronometro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
												.addComponent(Pangrama, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(80, 80, 80)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(layout.createSequentialGroup()
														.addComponent(Titulo)
														.addGap(11, 11, 11)
														.addComponent(Acerto))
												.addGroup(layout.createSequentialGroup()
														.addComponent(jLabel2)
														.addGap(0, 0, 0)
														.addComponent(erros)))
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGap(10, 10, 10)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(layout.createSequentialGroup()
														.addGap(1, 1, 1)
														.addComponent(jLabel1))
												.addGroup(layout.createSequentialGroup()
														.addGap(10, 10, 10)
														.addComponent(Titulo))
												.addGroup(layout.createSequentialGroup()
														.addGap(10, 10, 10)
														.addComponent(Acerto)))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel2)
												.addComponent(erros)))
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(Jfase)
												.addComponent(jLabel4))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(Cronometro, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(Pangrama)))
						.addGap(8, 8, 8)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(layout.createSequentialGroup()
										.addGap(9, 9, 9)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(ProxLetra)
												.addComponent(LetraPressionada))))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
						.addGap(10, 10, 10)
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(72, 72, 72))
				);

		pack();
	}

	private void LetraWActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void LetraEActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void LetraRActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void LetraTActionPerformed(java.awt.event.ActionEvent evt) {
	}
	private void LetraYActionPerformed(java.awt.event.ActionEvent evt) {
	}
	private void LetraUActionPerformed(java.awt.event.ActionEvent evt) {
	}
	private void LetraPActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void LetraIActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void LetraOActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void backActionPerformed(java.awt.event.ActionEvent evt) {
	}
	private void LetraAActionPerformed(java.awt.event.ActionEvent evt) {            }
	private void LetraSActionPerformed(java.awt.event.ActionEvent evt) {

	}
	private void LetraKActionPerformed(java.awt.event.ActionEvent evt) {

	}
	private void LetraJActionPerformed(java.awt.event.ActionEvent evt) {  

	}
	private void LetraHActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void LetraDActionPerformed(java.awt.event.ActionEvent evt) {
	}
	private void LetraFActionPerformed(java.awt.event.ActionEvent evt) {
	}
	private void LetraGActionPerformed(java.awt.event.ActionEvent evt) {
	}
	private void LetraLActionPerformed(java.awt.event.ActionEvent evt) {
	}
	private void LetraAActionPerformed1(java.awt.event.ActionEvent evt) {
	}
	private void LetraZActionPerformed(java.awt.event.ActionEvent evt) {
	}
	private void LetraXActionPerformed(java.awt.event.ActionEvent evt) {
	}
	private void LetraCActionPerformed(java.awt.event.ActionEvent evt) {
	}
	private void LetraVActionPerformed(java.awt.event.ActionEvent evt) {
	}
	private void LetraBActionPerformed(java.awt.event.ActionEvent evt) {
	}
	private void LetraNActionPerformed(java.awt.event.ActionEvent evt) {
	}
	private void LetraMActionPerformed(java.awt.event.ActionEvent evt) {
	}
	private void VirgulaActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void PontoActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void TextAreaKeyPressed(java.awt.event.KeyEvent evt) {

		//
		if(evt.getKeyCode() != KeyEvent.VK_CAPS_LOCK && evt.getKeyCode() != KeyEvent.VK_SHIFT )
		{
			t.start();  
			char letra = evt.getKeyChar();  
			LetraPressionada.setText(String.valueOf(letra));    

			if(letra == pan1[i]){ 
				String letra1 = String.valueOf(letra); 
				letra1 = letra1.toLowerCase(); 
				mudarCorCerta(letra1); 
				letra_certa++; 
				i++;    
				Acerto.setText(Double.toString(letra_certa));    
				ProxLetra.setText(String.valueOf(pan1[i])); 
				if(' '== pan1[i]){  
					ProxLetra.setText(String.valueOf("SPACE"));
				}
			}else{ 

				if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE){
					back.setBackground(Color.RED);
				}
				if(evt.getKeyCode() == 9){
					Tab.setBackground(Color.RED);
				}
				if(evt.getKeyCode() == 17){
					ctrl.setBackground(Color.RED);
				}
				if(evt.getKeyCode() == 18){
					Alt.setBackground(Color.RED);
				}

				String letra1 = String.valueOf(letra);
				letra1 = letra1.toLowerCase();
				mudarCorErrada(letra1);
				if(letra_errada != pan1.length - 1){   
					letra_errada++;
				} else if(letra_errada == pan1.length - 1){

					t.stop(); 
					JOptionPane.showMessageDialog(null,"FAÇA DE NOVO!\nVocê errou mais que devia" );
					reiniciarCronometro();
					TextAreaKeyReleased(evt); 
					i = 0;
					ProxLetra.setText(String.valueOf(pan1[0]));
					letra_certa = 0;
					Acerto.setText(Double.toString(letra_certa));
					letra_errada = 0;
					erros.setText(Double.toString(letra_errada));
					TextArea.setText("");

				}
				erros.setText(Double.toString(letra_errada));
			}
			int erro = (int) ((pan1.length - 1)-((pan1.length - 1) * 0.80)) ; 


			if(i >= pan1.length -1 && letra_errada <= erro && fase == 1) {

				t.stop();
				pan1 = (frase2.get(new Random().nextInt(frase2.size()))).toCharArray(); 
				Pangrama.setText(String.valueOf (pan1));
				fase ++;
				Jfase.setText(String.valueOf (fase));
				TextAreaKeyReleased(evt);
				char nota = calcularNota(letra_errada, letra_certa);
				JOptionPane.showMessageDialog(null,"Concluido!\nVocê Passou de Fase\nErros: " + letra_errada +
						"\nPercentual de erro : " + String.format("%.2f",(letra_errada/letra_certa)*100)+"%"+
						"\nSUA NOTA FOI: "+ nota);
				reiniciarCronometro();
				i = 0;
				ProxLetra.setText(String.valueOf(pan1[0]));
				letra_certa = 0;
				Acerto.setText(Double.toString(letra_certa));
				letra_errada = 0;
				erros.setText(Double.toString(letra_errada));
				TextArea.setText("");

			} else if (i >= pan1.length -1 && letra_errada >= erro && fase == 1){ 
				t.stop();
				TextAreaKeyReleased(evt);
				char nota = calcularNota(letra_errada, letra_certa);
				JOptionPane.showMessageDialog(null,"FAÇA DE NOVO!\nErros: " + letra_errada +
						"\nPercentual de erro : " + String.format("%.2f",(letra_errada/letra_certa)*100)+"%"+
						"\nSUA NOTA FOI: "+ nota);
				reiniciarCronometro();
				i = 0;
				ProxLetra.setText(String.valueOf(pan1[0]));
				letra_certa = 0;
				Acerto.setText(Double.toString(letra_certa));
				letra_errada = 0;
				erros.setText(Double.toString(letra_errada));
				TextArea.setText("");
			}

			if(i >= pan1.length -1 && letra_errada <= erro && fase == 2) {

				t.stop();
				pan1 = (frase3.get(new Random().nextInt(frase3.size()))).toCharArray();
				Pangrama.setText(String.valueOf (pan1));
				fase ++;
				Jfase.setText(String.valueOf (fase));
				TextAreaKeyReleased(evt);
				char nota = calcularNota(letra_errada, letra_certa);
				JOptionPane.showMessageDialog(null,"Concluido!\n Você Passou de Fase\nErros: " + letra_errada +
						"\nPercentual de erro : " + String.format("%.2f",(letra_errada/letra_certa)*100)+"%"+
						"\nSUA NOTA FOI: "+ nota);
				reiniciarCronometro();
				i = 0;
				ProxLetra.setText(String.valueOf(pan1[0]));
				letra_certa = 0;
				Acerto.setText(Double.toString(letra_certa));
				letra_errada = 0;
				erros.setText(Double.toString(letra_errada));
				TextArea.setText("");
			} else if (i >= pan1.length -1 && letra_errada >= erro && fase == 2){
				t.stop();
				TextAreaKeyReleased(evt);
				char nota = calcularNota(letra_errada, letra_certa);
				JOptionPane.showMessageDialog(null,"FAÇA DE NOVO!\nErros: " + letra_errada +
						"\nPercentual de erro : " + String.format("%.2f",(letra_errada/letra_certa)*100)+"%"+
						"\nSUA NOTA FOI: "+ nota);
				reiniciarCronometro();
				i = 0;
				ProxLetra.setText(String.valueOf(pan1[0]));
				letra_certa = 0;
				Acerto.setText(Double.toString(letra_certa));
				letra_errada = 0;
				erros.setText(Double.toString(letra_errada));
				TextArea.setText("");
			}


			if(i >= pan1.length -1 && letra_errada <= erro && fase == 3) {
				t.stop();
				TextAreaKeyReleased(evt);
				char nota = calcularNota(letra_errada, letra_certa);
				JOptionPane.showMessageDialog(null,"Concluido!\nErros: " + letra_errada +
						"\nPercentual de erro : " + String.format("%.2f",(letra_errada/letra_certa)*100)+"%"+
						"\nSUA NOTA FOI: "+ nota);
				JOptionPane.showMessageDialog(null,"PARABENS você concluiu o desafio");
				int continuar = JOptionPane.showConfirmDialog(null, "deseja reinicar? ");
				if (continuar == JOptionPane.YES_OPTION) {
					pan1 = (frase1.get(new Random().nextInt(frase1.size()))).toCharArray();
					Pangrama.setText(String.valueOf (pan1));
					reiniciarCronometro();
					fase = 1;
					Jfase.setText(String.valueOf (fase));
					i = 0;
					ProxLetra.setText(String.valueOf(pan1[0]));
					letra_certa = 0;
					Acerto.setText(Double.toString(letra_certa));
					letra_errada = 0;
					erros.setText(Double.toString(letra_errada));
					TextArea.setText("");
				}else {
					JOptionPane.showMessageDialog(null, "Então até a proxima!");
					System.exit(0);
				}

			} else if (i >= pan1.length -1 && letra_errada >= erro && fase == 3){
				t.stop();
				TextAreaKeyReleased(evt);
				char nota = calcularNota(letra_errada, letra_certa);
				JOptionPane.showMessageDialog(null,"FAÇA DE NOVO!\nErros: " + letra_errada +
						"\nPercentual de erro : " + String.format("%.2f",(letra_errada/letra_certa)*100)+"%"+
						"\nSUA NOTA FOI: "+ nota);
				reiniciarCronometro();
				i = 0;
				ProxLetra.setText(String.valueOf(pan1[0]));
				letra_certa = 0;
				Acerto.setText(Double.toString(letra_certa));
				letra_errada = 0;
				erros.setText(Double.toString(letra_errada));
				TextArea.setText("");
			}

		}else {
			if(evt.getKeyCode() == KeyEvent.VK_CAPS_LOCK){
				caps.setBackground(Color.BLUE);
			}
			if(evt.getKeyCode() == KeyEvent.VK_SHIFT){
				shift.setBackground(Color.BLUE);
			}

		}


	}
	private void LetraQActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private void TextAreaKeyReleased(java.awt.event.KeyEvent evt) {
		if(evt.getKeyCode() == KeyEvent.VK_A){
			LetraA.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_B){
			LetraB.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_C){
			LetraC.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_D){
			LetraD.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_E){
			LetraE.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_F){
			LetraF.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_G){
			LetraG.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_H){
			LetraH.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_I){
			LetraI.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_J){
			LetraJ.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_K){
			LetraK.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_L){
			LetraL.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_M){
			LetraM.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_N){
			LetraN.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_O){
			LetraO.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_P){
			LetraP.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_Q){
			LetraQ.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_R){
			LetraR.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_S){
			LetraS.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_T){
			LetraT.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_U){
			LetraU.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_V){
			LetraV.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_W){
			LetraW.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_X){
			LetraX.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_Y){
			LetraY.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_Z){
			LetraZ.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_SPACE){
			spaco.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_CAPS_LOCK){
			caps.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_SHIFT){
			shift.setBackground(null);
		}
		if(evt.getKeyCode() == 0){
			LetraA.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_COMMA){
			Virgula.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_PERIOD){
			Ponto.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE){
			back.setBackground(null);
		}
		if(evt.getKeyCode() == 61){
			igual.setBackground(null);
		}
		if(evt.getKeyCode() == 45){
			ifen.setBackground(null);
		}
		if(evt.getKeyCode() == 222){
			aspa.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_0){
			Num0.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_1){
			Num1.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_2){
			Num2.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_3){
			Num3.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_4){
			Num4.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_5){
			Num5.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_6){
			Num6.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_7){
			Num7.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_8){
			Num8.setBackground(null);
		}
		if(evt.getKeyCode() == KeyEvent.VK_9){
			Num9.setBackground(null);
		}
		if(evt.getKeyCode() == 9){
			Tab.setBackground(null);
		}
		if(evt.getKeyCode() == 17){
			ctrl.setBackground(null);
		}
		if(evt.getKeyCode() == 18){
			Alt.setBackground(null);
		}

	}
	private void ctrlActionPerformed(java.awt.event.ActionEvent evt) {
	}
	private void aspaActionPerformed(java.awt.event.ActionEvent evt) {
	}
	private void Num1ActionPerformed(java.awt.event.ActionEvent evt) {
	}
	private void Num2ActionPerformed(java.awt.event.ActionEvent evt) {
	}
	private void Num3ActionPerformed(java.awt.event.ActionEvent evt) {
	}
	private void Num4ActionPerformed(java.awt.event.ActionEvent evt) {
	}
	private void Num5ActionPerformed(java.awt.event.ActionEvent evt) {
	}
	private void Num6ActionPerformed(java.awt.event.ActionEvent evt) {
	}
	private void Num7ActionPerformed(java.awt.event.ActionEvent evt) {
	}
	private void Num8ActionPerformed(java.awt.event.ActionEvent evt) {
	}
	private void Num9ActionPerformed(java.awt.event.ActionEvent evt) {
	}
	private void igualActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private void Num0ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void shiftActionPerformed(java.awt.event.ActionEvent evt) {

	}


	private void reiniciarCronometro(){
		if(t.isRunning()) 
		{
			t.stop();
			TextArea.setEnabled(false); 
		}
		m=0; s=0; cs=0;
		atualizacaoCronometro();

	}


	private void verificacaoCronometro(){
		if(t.isRunning()) 
		{
			if(s == 30){ 
				t.stop();
				JOptionPane.showMessageDialog(null,"FAÇA DE NOVO!\nVocê passou do tempo" );
				reiniciarCronometro();
				i = 0;
				ProxLetra.setText(String.valueOf(pan1[0]));
				letra_certa = 0;
				Acerto.setText(Double.toString(letra_certa));
				letra_errada = 0;
				erros.setText(Double.toString(letra_errada));
				TextArea.setText("");
			}
		}

	}

	private static char calcularNota(double erro, double acerto) {
		char nota = ' ';
		double por= 100 - ((erro/acerto)*100);
		if (por >= 90 ){
			nota = 'A';
		} else if (por >= 80 ){
			nota = 'B';
		} else if (por >= 60 ){
			nota = 'C';
		} else if (por >= 40 ){
			nota = 'D';
		} else if (por >= 20 ){
			nota = 'E';
		} else if (por <= 20 ){
			nota = 'F';
		}
		return nota;
	}

	public void mudarCorCerta(String letra){
		switch(letra){
		case "a" :{
			LetraA.setBackground(Color.GREEN);
			break;}
		case "b" :{
			LetraB.setBackground(Color.GREEN);
			break;}
		case "c" :{
			LetraC.setBackground(Color.GREEN);
			break;}
		case "d" :{
			LetraD.setBackground(Color.GREEN);
			break;}
		case "e" :{
			LetraE.setBackground(Color.GREEN);
			break;}
		case "f" :{
			LetraF.setBackground(Color.GREEN);
			break;}
		case "g" :{
			LetraG.setBackground(Color.GREEN);
			break;}
		case "h" :{
			LetraH.setBackground(Color.GREEN);
			break;}
		case "i" :{
			LetraI.setBackground(Color.GREEN);
			break;}
		case "j" :{
			LetraJ.setBackground(Color.GREEN);
			break;}
		case "k" :{
			LetraK.setBackground(Color.GREEN);
			break;}
		case "l" :{
			LetraL.setBackground(Color.GREEN);
			break;}
		case "m" :{
			LetraM.setBackground(Color.GREEN);
			break;}
		case "n" :{
			LetraN.setBackground(Color.GREEN);
			break;}
		case "o" :{
			LetraO.setBackground(Color.GREEN);
			break;}
		case "p" :{
			LetraP.setBackground(Color.GREEN);
			break;}
		case "q" :{
			LetraQ.setBackground(Color.GREEN);
			break;}
		case "r" :{
			LetraR.setBackground(Color.GREEN);
			break;}
		case "s" :{
			LetraS.setBackground(Color.GREEN);
			break;}
		case "t" :{
			LetraT.setBackground(Color.GREEN);
			break;}
		case "u" :{
			LetraU.setBackground(Color.GREEN);
			break;}
		case "v" :{
			LetraV.setBackground(Color.GREEN);
			break;}
		case "w" :{
			LetraW.setBackground(Color.GREEN);
			break;}
		case "x" :{
			LetraX.setBackground(Color.GREEN);
			break;}
		case "y" :{
			LetraY.setBackground(Color.GREEN);
			break;}
		case "z" :{
			LetraZ.setBackground(Color.GREEN);
			break;}
		case " " :{
			spaco.setBackground(Color.GREEN);
			break;}
		case "," :{
			Virgula.setBackground(Color.GREEN);
			break;}
		case "." :{
			Ponto.setBackground(Color.GREEN);
			break;}
		case "Ã§" :{
			LetraA.setBackground(Color.GREEN);
			break;}
		}

	}

	public void mudarCorErrada(String letra){
		switch(letra){
		case "a" :{
			LetraA.setBackground(Color.RED);
			break;}
		case "b" :{
			LetraB.setBackground(Color.RED);
			break;}
		case "c" :{
			LetraC.setBackground(Color.RED);
			break;}
		case "d" :{
			LetraD.setBackground(Color.RED);
			break;}
		case "e" :{
			LetraE.setBackground(Color.RED);
			break;}
		case "f" :{
			LetraF.setBackground(Color.RED);
			break;}
		case "g" :{
			LetraG.setBackground(Color.RED);
			break;}
		case "h" :{
			LetraH.setBackground(Color.RED);
			break;}
		case "i" :{
			LetraI.setBackground(Color.RED);
			break;}
		case "j" :{
			LetraJ.setBackground(Color.RED);
			break;}
		case "k" :{
			LetraK.setBackground(Color.RED);
			break;}
		case "l" :{
			LetraL.setBackground(Color.RED);
			break;}
		case "m" :{
			LetraM.setBackground(Color.RED);
			break;}
		case "n" :{
			LetraN.setBackground(Color.RED);
			break;}
		case "o" :{
			LetraO.setBackground(Color.RED);
			break;}
		case "p" :{
			LetraP.setBackground(Color.RED);
			break;}
		case "q" :{
			LetraQ.setBackground(Color.RED);
			break;}
		case "r" :{
			LetraR.setBackground(Color.RED);
			break;}
		case "s" :{
			LetraS.setBackground(Color.RED);
			break;}
		case "t" :{
			LetraT.setBackground(Color.RED);
			break;}
		case "u" :{
			LetraU.setBackground(Color.RED);
			break;}
		case "v" :{
			LetraV.setBackground(Color.RED);
			break;}
		case "w" :{
			LetraW.setBackground(Color.RED);
			break;}
		case "x" :{
			LetraX.setBackground(Color.RED);
			break;}
		case "y" :{
			LetraY.setBackground(Color.RED);
			break;}
		case "z" :{
			LetraZ.setBackground(Color.RED);
			break;}
		case " " :{
			spaco.setBackground(Color.RED);
			break;}
		case "," :{
			Virgula.setBackground(Color.RED);
			break;}
		case "." :{
			Ponto.setBackground(Color.RED);
			break;}
		case "Ã§" :{
			LetraA.setBackground(Color.RED);
			break;}
		case "-" :{
			ifen.setBackground(Color.RED);
			break;}
		case "_" :{
			ifen.setBackground(Color.RED);
			break;}
		case "=" :{
			igual.setBackground(Color.RED);
			break;}
		case "+" :{
			igual.setBackground(Color.RED);
			break;}
		case "'" :{
			aspa.setBackground(Color.RED);
			break;}
		case "1" :{
			Num1.setBackground(Color.RED);
			break;}
		case "2" :{
			Num2.setBackground(Color.RED);
			break;}
		case "3" :{
			Num3.setBackground(Color.RED);
			break;}
		case "4" :{
			Num4.setBackground(Color.RED);
			break;}
		case "5" :{
			Num5.setBackground(Color.RED);
			break;}
		case "6" :{
			Num6.setBackground(Color.RED);
			break;}
		case "7" :{
			Num7.setBackground(Color.RED);
			break;}
		case "8" :{
			Num8.setBackground(Color.RED);
			break;}
		case "9" :{
			Num9.setBackground(Color.RED);
			break;}
		case "0" :{
			Num0.setBackground(Color.RED);
			break;}
		}

	}


	public static void main(String args[]) { 
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Teclado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Teclado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Teclado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Teclado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Teclado().setVisible(true);
			}
		});
	}
	private javax.swing.JLabel Acerto;
	private javax.swing.JButton Alt;
	private javax.swing.JLabel Cronometro;
	private javax.swing.JLabel Jfase;
	private javax.swing.JButton LetraA;
	private javax.swing.JButton LetraB;
	private javax.swing.JButton LetraC;
	private javax.swing.JButton LetraD;
	private javax.swing.JButton LetraE;
	private javax.swing.JButton LetraF;
	private javax.swing.JButton LetraG;
	private javax.swing.JButton LetraH;
	private javax.swing.JButton LetraI;
	private javax.swing.JButton LetraJ;
	private javax.swing.JButton LetraK;
	private javax.swing.JButton LetraL;
	private javax.swing.JButton LetraM;
	private javax.swing.JButton LetraN;
	private javax.swing.JButton LetraO;
	private javax.swing.JButton LetraP;
	private javax.swing.JLabel LetraPressionada;
	private javax.swing.JButton LetraQ;
	private javax.swing.JButton LetraR;
	private javax.swing.JButton LetraS;
	private javax.swing.JButton LetraT;
	private javax.swing.JButton LetraU;
	private javax.swing.JButton LetraV;
	private javax.swing.JButton LetraW;
	private javax.swing.JButton LetraX;
	private javax.swing.JButton LetraY;
	private javax.swing.JButton LetraZ;
	private javax.swing.JButton LetraA1;
	private javax.swing.JButton Num0;
	private javax.swing.JButton Num1;
	private javax.swing.JButton Num2;
	private javax.swing.JButton Num3;
	private javax.swing.JButton Num4;
	private javax.swing.JButton Num5;
	private javax.swing.JButton Num6;
	private javax.swing.JButton Num7;
	private javax.swing.JButton Num8;
	private javax.swing.JButton Num9;
	private javax.swing.JLabel Pangrama;
	private javax.swing.JButton Ponto;
	private javax.swing.JLabel ProxLetra;
	private javax.swing.JButton Tab;
	private javax.swing.JTextArea TextArea;
	private javax.swing.JLabel Titulo;
	private javax.swing.JButton Virgula;
	private javax.swing.JButton aspa;
	private javax.swing.JButton back;
	private javax.swing.JButton caps;
	private javax.swing.JButton ctrl;
	private javax.swing.JButton enter;
	private javax.swing.JLabel erros;
	private javax.swing.JButton ifen;
	private javax.swing.JButton igual;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JButton shift;
	private javax.swing.JButton spaco;
}
