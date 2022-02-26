// Java program to create a simple calculator
// with basic +, -, /, * using java swing elements

import java.awt.event.*;
import javax.swing.*;


import java.awt.*;
class calculator extends JFrame implements ActionListener {
	// create a frame
	static JFrame f;

	// create a textfield
	static JTextField l;
	static JTextField w;

	// store operator and operands
	String s0, s1, s2;

	// default constructor
	calculator()
	{
		s0 = s1 = s2 = "";
	}

	// main function
	public static void main(String args[])
	{
		// create a frame
		f = new JFrame("calculator");
		f.setResizable(false);

		try {
			// set look and feel
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}

		// create a object of class
		calculator c = new calculator();

		// create the textfields
		l = new JTextField(30);
		l.setPreferredSize(new Dimension(400,60)); 
		w = new JTextField(30);
		w.setPreferredSize(new Dimension(400,60)); 


		// set the textfield to non editable
		l.setEditable(false);
		w.setEditable(false);
		// create number buttons and some operators
		JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, beq, beq1, bpi, bez, pow, sqrt, log, ex, sol;
		//per = percentage; the button worked but doesn't have a place in aur Calculator

		// create number buttons
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");


		// equals button
		beq1 = new JButton("=");

		// create operator buttons
		ba = new JButton("+");
		bs = new JButton("-");
		bd = new JButton("/");
		bm = new JButton("x");
		bpi = new JButton("π");
		bez = new JButton("e");
		beq = new JButton("C");
		pow = new JButton("^");
		sqrt = new JButton("√");
		log = new JButton("log()");
		ex = new JButton("ex");
		sol = new JButton("sol");
		//per = new JButton("%");

		// create . button
		be = new JButton(".");

		//Set Button size
		b0.setPreferredSize(new Dimension(90, 90));
		b0.setPreferredSize(new Dimension(90, 90));
		b1.setPreferredSize(new Dimension(90, 90));
		b2.setPreferredSize(new Dimension(90, 90));
		b3.setPreferredSize(new Dimension(90, 90));
		b4.setPreferredSize(new Dimension(90, 90));
		b5.setPreferredSize(new Dimension(90, 90));
		b6.setPreferredSize(new Dimension(90, 90));
		b7.setPreferredSize(new Dimension(90, 90));
		b8.setPreferredSize(new Dimension(90, 90));
		b9.setPreferredSize(new Dimension(90, 90));
		beq1.setPreferredSize(new Dimension(90, 90));
		ba.setPreferredSize(new Dimension(90, 90));
		bs.setPreferredSize(new Dimension(90, 90));
		bd.setPreferredSize(new Dimension(90, 90));
		bm.setPreferredSize(new Dimension(90, 90));
		beq.setPreferredSize(new Dimension(90,90));
		be.setPreferredSize(new Dimension(90, 90));
		bpi.setPreferredSize(new Dimension(90,90));
		bez.setPreferredSize(new Dimension(90, 90));
		pow.setPreferredSize(new Dimension(90, 90));
		sqrt.setPreferredSize(new Dimension(90, 90));
		log.setPreferredSize(new Dimension(90, 90));
		ex.setPreferredSize(new Dimension(90, 90));
		sol.setPreferredSize(new Dimension(90, 90));
		//per.setPreferredSize(new Dimension(80, 80));

		// create a panel
		JPanel p = new JPanel();
		
		// add action listeners
		bm.addActionListener(c);
		bd.addActionListener(c);
		bs.addActionListener(c);
		ba.addActionListener(c);
		b9.addActionListener(c);
		b8.addActionListener(c);
		b7.addActionListener(c);
		b6.addActionListener(c);
		b5.addActionListener(c);
		b4.addActionListener(c);
		b3.addActionListener(c);
		b2.addActionListener(c);
		b1.addActionListener(c);
		b0.addActionListener(c);
		be.addActionListener(c);
		beq.addActionListener(c);
		beq1.addActionListener(c);
		bpi.addActionListener(c);
		bez.addActionListener(c);
		pow.addActionListener(c);
		sqrt.addActionListener(c);
		log.addActionListener(c);
		ex.addActionListener(c);
		sol.addActionListener(c);
		//per.addActionListener(c);

		// add elements to panel
		p.add(w);
		p.add(l);
		p.add(ex);
		p.add(sol);
		p.add(log);
		p.add(beq);
		p.add(pow);
		p.add(sqrt);
		p.add(bpi);
		p.add(bez);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(ba);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(bs);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(bm);
		p.add(beq1);
		p.add(b0);
		p.add(be);
		p.add(bd);
		//p.add(per);
		
		

		// set Background of panel
		p.setBackground(Color.DARK_GRAY);

		// add panel to frame
		f.add(p);
		
		//frame size
		f.setSize(450, 750);
		f.show();
	}

	public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand();

		//sympols get replaced with the actual number of pi and the euler number
		if (s.equals("π")){
				  s = "3.1416";
		} 

		if (s.equals("e")){
				s = "2.7183";
		}

		// if the value is a number
		if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
			// if operand is present then add to second no
			if (!s1.equals(""))
				s2 = s2 + s;
			else
				s0 = s0 + s;

			// set the value of text
			l.setText(s0 + s1 + s2);
		}

		else if (s.charAt(0) == 'C') {
			// clear the one letter
			s0 = s1 = s2 =  "";

			// set the value of text
			l.setText(s0 + s1 + s2);
			w.setText("");
 
		}

		else if (s.charAt(0) == '=') {

			double te;

			// store the value in 1st
			// in the following conditions, the calculation takes place
			if (s1.equals("+")){
				te = (Double.parseDouble(s0) + Double.parseDouble(s2));
			}
			else if (s1.equals("-")){
				te = (Double.parseDouble(s0) - Double.parseDouble(s2));
			}
			else if (s1.equals("/")){
				te = (Double.parseDouble(s0) / Double.parseDouble(s2));
			}
			else if (s1.equals("^")){
				te = (java.lang.Math.pow(Double.parseDouble(s0), Double.parseDouble(s2)));
			}
			else if (s1.equals("√")){
				double root = 1 / Double.parseDouble(s0);
				te = (java.lang.Math.pow(Double.parseDouble(s2), root));
			}
			else if (s1.equals("log()")){
				te = (java.lang.Math.log10(Double.parseDouble(s2)) / java.lang.Math.log10(Double.parseDouble(s0)));
			}
			// else if (s1.equals("%")){
			// 	te = (Double.parseDouble(s2) * (Double.parseDouble(s0)/100));
			// }
			else
				te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 

			// set the value of text
			te = java.lang.Math.round(te*10000000000.0)/10000000000.0;

			l.setText(s0 + s1 + s2 + "=" + te);

			// convert it to string
			s0 = Double.toString(te);

			s1 = s2 = "";
		}

		else if(s1.equals("") || s2.equals("")){
			// if there was no operand
				s1 = s;
			l.setText(s0 + s1 + s2);
		}

		if (s.charAt(1)== 'x' || s.charAt(1)=='o'){

			//if->generates an exercise ; else-> controls the solution
			if(s.charAt(1)=='x'){

				// clear the one letter
				s0 = s1 = s2 =  "";

				// set the value of text
				l.setText(s0 + s1 + s2);
				
				// declarate and initialize Datatypes
				double x = Math.random()*10;
				double y = Math.random()*10;
				double opv = Math.random();
				String op = "";

				// round the operands
				x = Math.round(x);
				y = Math.round(y);
			
				//generate an operator
				if(opv<= 0.25){
					op ="+";
				}
				else if(opv>0.25 && opv <= 0.5){
					op ="-";
				}
				else if(opv>0.5 && opv <= 0.75){
					op ="*";
				}
				else{
					op ="/";
				}

				//prevention of negative solutions -> subtraction tasks
				if(x>y){
					w.setText("Was ist die Lösung von "+x + op + y+"?");
				}
				else{
					w.setText("Was ist die Lösung von "+y + op + x+"?");
				}
			}

			else {
				double solution;

				//get Chars for calculation of the exercise
				String exercise = w.getText();
				char xv = exercise.charAt(23);
				char ov = exercise.charAt(26);
				char yv = exercise.charAt(27);

				//convert Char to String
				String xvstr = Character.toString(xv);
				String yvstr = Character.toString(yv);
				

				//convert String to double
				double xvv = Double.parseDouble(xvstr); 
				double yvv = Double.parseDouble(yvstr); 
			
				//calculate the solution of the exercise
				if(ov == '+'){
					solution = xvv + yvv;
				}
				else if(ov =='-'){
					solution = xvv - yvv;
				}
				else if(ov == '*'){
					solution = xvv * yvv;
				}
				else{
					solution = xvv / yvv;
				}

				//round solution to one decimal place
				solution = solution * 10;
				solution = Math.round(solution);
				solution = solution / 10;

				//clear Textfield
				w.setText("");

				//round the solution of the user to one decimal place 
				//->works until the solution number ends with 0

				// double s0round = Double.parseDouble(s0);
				// s0round = s0round*10;
				// s0round = Math.round(s0round);
				// s0round = s0round /10;

				//check the exercise 
				if(Double.parseDouble(s0) == solution){
					w.setText("Richtig!");
				}
				else{
					w.setText("Leider Falsch, die Lösung wäre: " + solution);
				}
			}
		}

	
	}
}

