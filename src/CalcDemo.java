// Creator: Reginald Keyshawn Billups
//Date Started: February 1, 2022
//Date Finished: March 13, 2022
//Project Name: GUI Calculator Project
//Goal: Make a GUI Calculator using Object Oriented Programming
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import java.awt.Button;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;

import java.awt.Font;
import javax.swing.JRadioButton;

public class CalcDemo extends JFrame {

	/**
	 * 
	 */
	//Variables
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private Button button_20;
	private Button button_19;
	private Button button_21;
	private String display="";
	boolean operationPressed=false;
	boolean exponentPressed=false;
	private String numPostOp="";
	private	double tempAns=0;
	ArrayList<String> arr = new ArrayList<String>();
	
	int size=0;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcDemo frame = new CalcDemo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalcDemo() {
		
		//creating Pane and Text Field
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 559);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(95, 105, 347, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		//////////////////////////////////////////
		//////////////////////////////////////////
		
		
		

		
		///////////////////////////////////
		    //NUMBER BUTTONS
		///////////////////////////////////////
		
		//			9
		
		button_21 = new Button("9");
		button_21.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_21.setForeground(Color.BLACK);
		button_21.setBackground(Color.WHITE);
		button_21.setBounds(83, 169, 66, 51);
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display+="9";
				
				textField.setText(display);
				
				if(operationPressed==true) {
					numPostOp+=9;
					
				}
				
			}
		});
		contentPane.add(button_21);
		
		/// 		8
		button_20 = new Button("8");
		button_20.setForeground(Color.BLACK);
		button_20.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_20.setBackground(Color.WHITE);
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//updates display and holds numbers pressed in a string
				display+="8";
				textField.setText(display);
				
					if(operationPressed==true) {
						numPostOp+=8;
						
					}
			}
		});
		button_20.setBounds(170, 169, 66, 51);
		contentPane.add(button_20);	
		
		//		7
		button_19 = new Button("7");
		button_19.setFont(new Font("Arial", Font.PLAIN, 20));
		button_19.setForeground(new Color(0, 0, 0));
		button_19.setBackground(Color.WHITE);
		button_19.setBounds(254, 169, 66, 51);
		button_19.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//updates display and holds numbers pressed in a string
			display+="7";
			textField.setText(display);
			
			if(operationPressed==true) {
				numPostOp+=7;
				
				}
			}
		});
		contentPane.add(button_19);
	
		
		//		6
		Button button_15 = new Button("6");
		button_15.setForeground(Color.BLACK);
		button_15.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_15.setBackground(Color.WHITE);
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//updates display and holds numbers pressed in a string
				display+="6";
				
				textField.setText(display);
				if(operationPressed==true) {
					numPostOp+=6;
					
				}
			}
		});
		button_15.setBounds(254, 233, 66, 51);
		contentPane.add(button_15);
		
		//			5
		Button button_16 = new Button("5");
		button_16.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_16.setForeground(Color.BLACK);
		button_16.setBackground(Color.WHITE);
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//updates display and holds numbers pressed in a string
				display+="5";
				
				textField.setText(display);
				
				if(operationPressed==true) {
					numPostOp+=5;
					
				}
			}
		});
		button_16.setBounds(170, 233, 66, 51);
		contentPane.add(button_16);
			
		//		4
		Button button_17 = new Button("4");
		button_17.setForeground(Color.BLACK);
		button_17.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_17.setBackground(Color.WHITE);
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//updates display and holds numbers pressed in a string
				display+="4";
				
				textField.setText(display);
				if(operationPressed==true) {
					numPostOp+=4;
					
				}
			}
		});
		button_17.setBounds(83, 233, 66, 51);
		contentPane.add(button_17);
		
		//		3
		Button button_13 = new Button("3");
		button_13.setForeground(Color.BLACK);
		button_13.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_13.setBackground(Color.WHITE);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//updates display and holds numbers pressed in a string
				display+="3";
				
				textField.setText(display);
				if(operationPressed==true) {
					numPostOp+=3;
					
				}
				
			}
		});
		button_13.setBounds(83, 299, 66, 51);
		contentPane.add(button_13);
		
		
		//			2
		Button button_12 = new Button("2");
		button_12.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_12.setForeground(Color.BLACK);
		button_12.setBackground(Color.WHITE);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//updates display and holds numbers pressed in a string
				display+="2";
				textField.setText(display);
				
				if(operationPressed==true) {
					numPostOp+=2;
					
				}
			}
		});
		button_12.setBounds(170, 299, 66, 51);
		contentPane.add(button_12);
		
		//			1
		Button button_11 = new Button("1");
		button_11.setForeground(Color.BLACK);
		button_11.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_11.setBackground(Color.WHITE);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//updates display and holds numbers pressed in a string
				display+="1";
				textField.setText(display);
				
				if(operationPressed==true) {
					numPostOp+=1;
					
				}
			}
		});
		button_11.setBounds(254, 299, 66, 51);
		contentPane.add(button_11);
		
		// 			0
		Button button_7 = new Button("0");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				//updates display and holds numbers pressed in a string
				display+="0";
				
				textField.setText(display);
				
				if(operationPressed==true) {
					numPostOp+=0;
					
				}

			}
		});
		button_7.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_7.setForeground(Color.BLACK);
		button_7.setBackground(Color.WHITE);
		button_7.setBounds(254, 366, 66, 51);
		contentPane.add(button_7);
		
		///  "."	
		Button button_2 = new Button(".");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//updates display and holds numbers pressed in a string
					display+=".";
				
				textField.setText(display);
				
				if(operationPressed==true) {
					numPostOp+=".";
					
				}
			}
		});
		button_2.setForeground(Color.BLACK);
		button_2.setFont(new Font("Dialog", Font.PLAIN, 25));
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(254, 433, 66, 51);
		contentPane.add(button_2);
		
		// negative symbol
		 Button button_22 = new Button("(-)");
		    button_22.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
		    		//updates display and holds numbers pressed in a string
		    		display+="-";
					
					textField.setText(display);
					
					if(operationPressed==true) {
						numPostOp+="-";
						
					}
		    	}
		    });
		    button_22.setForeground(Color.BLACK);
		    button_22.setFont(new Font("Arial", Font.PLAIN, 20));
		    button_22.setEnabled(false);
		    button_22.setBackground(Color.WHITE);
		    button_22.setBounds(413, 169, 66, 51);
		    contentPane.add(button_22);
		
		 
		/////////////////////////////////////
		//OPERATIONS
		///////////////////////////////
		
		
		/// DIVIDE
		Button button_18 = new Button("/");
		button_18.setForeground(Color.BLACK);
		button_18.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_18.setBackground(Color.WHITE);
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//adds number to array 
				if(operationPressed==true) {
					arr.add(numPostOp);
					display+="/";
					textField.setText(display);
					arr.add("/");
					numPostOp="";
				}
				// if first time pressing operator and adding number to array
				else {
				String number=display; 
				display+="/";
				
				textField.setText(display);
				arr.add(number);
				size++;
				
				operationPressed=true;
				 number="/";
				 arr.add(number);
				
			
				 size++;
				}
				 
			}
		});
		button_18.setBounds(336, 169, 66, 51);
		contentPane.add(button_18);
		
		/// MULTIPLICATION
		Button button_14 = new Button("*");
		button_14.setForeground(Color.BLACK);
		button_14.setBackground(Color.WHITE);
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//adds number to array
				if(operationPressed==true) {
					arr.add(numPostOp);
					display+="*";
					textField.setText(display);
					arr.add("*");
					numPostOp="";
				}
				// if first time pressing operator and adding number to array 
				else {
				
				String number=display; 
				display+="*";
				
				textField.setText(display);
				arr.add(number);
				size++;
				
				operationPressed=true;
				 number="*";
				 arr.add(number);
				
			
				 size++;
				}
			}
		});
		
		/// ADDITION
		Button button_10 = new Button("+");
		button_10.setForeground(Color.BLACK);
		button_10.setBackground(Color.WHITE);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//adds number to array
				if(operationPressed==true) {
					arr.add(numPostOp);
					display+="+";
					textField.setText(display);
					arr.add("+");
					numPostOp="";
				}
				// if first time pressing operator and adding number to array 
				else {
				
				String number=display; 
				display+="+";
				
				textField.setText(display);
				arr.add(number);
				size++;
				
				operationPressed=true;
				 number="+";
				 arr.add(number);
				
			
				 size++;
				}
			}
		});
		
		button_10.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_10.setBounds(336, 299, 66, 51);
		contentPane.add(button_10);
		button_14.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_14.setBounds(336, 233, 66, 51);
		contentPane.add(button_14);
		
		/// SUBTRACTION
		Button button_6 = new Button("-");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//adds number to array
				if(operationPressed==true) {
					arr.add(numPostOp);
					display+="-";
					textField.setText(display);
					arr.add("-");
					numPostOp="";
				}
				// if first time pressing operator and adding number to array 
				else {
				
				String number=display; 
				display+="-";
				
				textField.setText(display);
				arr.add(number);
				size++;
				
				operationPressed=true;
				 number="-";
				 arr.add(number);
				
			
				 size++;
				}
			
			
			}
		});
		button_6.setForeground(Color.BLACK);
		button_6.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_6.setBackground(Color.WHITE);
		button_6.setBounds(336, 366, 66, 51);
		contentPane.add(button_6);
		
		////  SQRT
		Button button = new Button("\u221A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				display+="V";
				textField.setText(display);
				arr.add("V");	
				
			}
		});
		    button.setForeground(Color.BLACK);
		    button.setFont(new Font("Dialog", Font.PLAIN, 20));
		    button.setBackground(Color.WHITE);
		    button.setBounds(83, 433, 66, 51);
		    contentPane.add(button);
		
		
		
		Button button_8 = new Button("^");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//adds number to array
				if(operationPressed==true) {
					arr.add(numPostOp);
					display+="^";
					textField.setText(display);
					arr.add("^");
					numPostOp="";
					
					
				}
				// if first time pressing operator and adding number to array 
				else {
				String number=display; 
				display+="^";
				
				textField.setText(display);
				arr.add(number);
				size++;
				
				operationPressed=true;
				 number="^";
				 arr.add(number);
				
			
				 size++;
				}
			}
		});
		button_8.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_8.setForeground(Color.BLACK);
		button_8.setBackground(Color.WHITE);
		button_8.setBounds(170, 366, 66, 51);
		contentPane.add(button_8);
		
		Button button_1 = new Button("%");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(operationPressed==false) {
					double temp;
					String number= display;
					temp=Double.parseDouble(number);
					temp=temp/100;
					display=String.valueOf(temp);
					textField.setText(display);
					
				}
					else {
						int length=numPostOp.length();
						double temp;
						String number= numPostOp;
						temp=Double.parseDouble(number);
						temp=temp/100;
						numPostOp=String.valueOf(temp);
						
						for(int i=0;i<length;i++) {
							display=display.substring(0, display.length()-1);
						}
						
						
						
						display+=String.valueOf(temp);
						textField.setText(display);
				}
				
				
				
			}
		});
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(170, 433, 66, 51);
		contentPane.add(button_1);
		
///////////////////////////////////////////
//////////////////////////////////////////
		
	
		// EQUALS
		Button button_3 = new Button("=");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//try catch block that will show "ERROR. PRESS AC"
				try {
				
					// if sqrt
				if(arr.get(0)=="V") {
					//creates new calc obj
					Calculator sqrtCalc=new Calculator();
					
					String getNum="";
					
					// retrieving user input after sqrt
					for(int i=0;i<display.length();i++) {
						
						if(display.charAt(i)!='V') {
							getNum+=display.charAt(i);
						}
					}
						//adds number to array, then calculates 
						arr.add(getNum);
						tempAns=sqrtCalc.sqrt(Double.parseDouble(arr.get(1)));
						
						display=String.valueOf(tempAns);
						textField.setText(display);
					
				}	
					//if not a sqrt operation
					else {
						//adds last number to array 
						arr.add(numPostOp);
				}
				
				////////////////////////////////////////////
				///////////////////////////////////////////
									
					//one operation
						if(arr.size()==3) {
							
							//creating calulator object
							Calculator one=new Calculator(arr);
							
							//switch case to decide what operation to use
					switch(arr.get(1)) {
						case "+":tempAns=one.add();
							break;
						case "-":tempAns=one.subtract();
							break;
						case "/":tempAns=one.divide();
							break;
						case "*":tempAns=one.multiply();
							break;	
						case "^":tempAns=one.exponent();
						break;
						}
					
					display=String.valueOf(tempAns);
					
					textField.setText(display);
					
					}
					//multiple operations
					else if(arr.size()>3){
						
						//creating calulator object
						Calculator one=new Calculator(arr);
						
						for(int i=0;i<arr.size();i++) {	
							
							//if first operation
							if(i%2==1&&i<2) {
								
								//switch case to decide what operation to use
							switch(arr.get(i)) {
								case "+":tempAns=one.add();
									break;
								case "-":tempAns=one.subtract();
									break;
								case "/":tempAns=one.divide();
									break;
								case "*":tempAns=one.multiply();
									break;	
									
								case "^":tempAns=one.exponent();
								break;
								}
								
								//calculates the rest
							}
							else if(i%2==1) {
								
								//switch case to decide what operation to use
								switch(arr.get(i)) {
								case "+":tempAns=one.add(tempAns);
									break;
								case "-":tempAns=one.subtract(tempAns);
									break;
								case "/":tempAns=one.divide(tempAns);
									break;
								case "*":tempAns=one.multiply(tempAns);
									break;
								case "^":tempAns=one.exponent(tempAns);
								break;
								
								
							}
						}
							//displays answer
						display=String.valueOf(tempAns);
						textField.setText(display);
					}
					
			}
						}catch(Exception i) {
	    		textField.setText("ERROR. PRESS AC");
	    		System.out.println("Things to know:\r\n"
	    				+ "\r\n"
	    				+ "1. SQRT=V on the calculator display\r\n"
	    				+ "2. The calculator does not do order of operations \r\n"
	    				+ "3. Square root can only be done alone i.e \r\n"
	    				+ "Works: Sqrt(64)\r\n"
	    				+ "Does not work: Sqrt(4)+1\r\n"
	    				+ "Please calculate the sqaure root then Press \"AC\", then \"ANS\" \r\n"
	    				+ "if you want to continue with your solution");
			}
		}
			
		});
		button_3.setForeground(Color.BLACK);
		button_3.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(336, 433, 66, 51);
		contentPane.add(button_3);
		    
		//		ANSWER BUTTON
		Button button_9 = new Button("ANS");
		 button_9.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 			
		 		//keep track of previous answer
		 		display+=String.valueOf(tempAns);
				
				textField.setText(display);
				
				if(operationPressed==true) {
					numPostOp+="tempAns";
					
				}
		 	}
		 });
		    button_9.setForeground(Color.BLACK);
		    button_9.setFont(new Font("Dialog", Font.PLAIN, 20));
		    button_9.setBackground(Color.WHITE);
		    button_9.setBounds(83, 366, 66, 51);
		    contentPane.add(button_9);
		
		
		
		
		//		CLEAR AND ALL CLEAR
		    Button button_4 = new Button("AC");
		    button_4.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
		    		
		    		display="";
		    		textField.setText(display);
		    		arr.clear();
		    		operationPressed=false;
		    		numPostOp="";
		    		size=0;
		    		
		    	}
		    });
		    button_4.setBackground(Color.WHITE);
		    button_4.setFont(new Font("Dialog", Font.PLAIN, 20));
		    button_4.setForeground(Color.BLACK);
		    button_4.setBounds(413, 305, 66, 179);
		    contentPane.add(button_4);
		    
		    Button button_5 = new Button("Clear");
		    button_5.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
		    		try {
		    		// if only one thing has been entered
		    		if(arr.size()==1) {
		    			display="";
			    		textField.setText(display);
			    		arr.clear();
			    		operationPressed=false;
			    		numPostOp="";
			    		size=0;
		    		}
		    		
		    		// if backspacing and operator has been chosen
		    		else if(operationPressed==false) {
		    			int temp=display.length();
			    		display=display.substring(0,temp-1);
			    		textField.setText(display);
		    		}
		    		
		    		else if(operationPressed==true&&arr.size()<3){	
		    			int temp=display.length();
		    			
		    			// if backspacing the first operation
		    			if(display.charAt(temp-1)=='+'||display.charAt(temp-1)=='/'||display.charAt(temp-1)=='-'||display.charAt(temp-1)=='*') {
		    				display=display.substring(0,temp-1);
	    					textField.setText(display);
	    					operationPressed=false;
	    					arr.remove(arr.size()-1);
	    					arr.remove(arr.size()-1);
	    					size=arr.size();
		    			}	
		    			// if backspacing a number
		    				else {
		    					 temp=numPostOp.length();
		    					 numPostOp=numPostOp.substring(0,temp-1);
		    					 temp=display.length();
		 			    		display=display.substring(0,temp-1);
		 			    		textField.setText(display);
					    		textField.setText(display);
		    			}		    		
		    		} 
		    		
		    			else if(operationPressed==true) {
		    				int temp=display.length();
		    				
		    				// if backspacing 2 operator or higher
		    				if(display.charAt(temp-1)=='+'||display.charAt(temp-1)=='/'||display.charAt(temp-1)=='-'||display.charAt(temp-1)=='*') {
		    					
		    					display=display.substring(0,temp-1);
		    					textField.setText(display);
		    					arr.remove(arr.size()-1);
		    					numPostOp=arr.get(arr.size()-1);
		    					arr.remove(arr.size()-1);
		    					
		    				}
		    				// if backspacing a number 2 operator or higher
		    				else {
		    					temp=numPostOp.length();
		    					 numPostOp=numPostOp.substring(0,temp-1);
		    					 temp=display.length();
		 			    		display=display.substring(0,temp-1);
		 			    		textField.setText(display);
					    		textField.setText(display);
		    				}
		    			}
		    		}catch(Exception i) {
		    			display="ERROR PRESS AC";
 			    		textField.setText(display);
		    		}
		    	}
		    	
		    });
		    button_5.setBackground(Color.WHITE);
		    button_5.setFont(new Font("Dialog", Font.PLAIN, 20));
		    button_5.setForeground(Color.BLACK);
		    button_5.setBounds(413, 233, 66, 66);
		    contentPane.add(button_5);
	    
		   
		    //makes it so that calc starts off
		    button_22.setEnabled(false);
		    button_21.setEnabled(false);
			button_20.setEnabled(false);
			button_19.setEnabled(false);
			button_18.setEnabled(false);
			button_17.setEnabled(false);
			button_16.setEnabled(false);
			button_15.setEnabled(false);
			button_14.setEnabled(false);
			button_13.setEnabled(false);
			button_12.setEnabled(false);
			button_11.setEnabled(false);
			button_10.setEnabled(false);
			button_9.setEnabled(false);
			button_8.setEnabled(false);
			button_7.setEnabled(false);
			button_6.setEnabled(false);
			button_5.setEnabled(false);
			button_4.setEnabled(false);
			button_3.setEnabled(false);
			button_2.setEnabled(false);
			button_1.setEnabled(false);
			button.setEnabled(false);
		    
		    JRadioButton rdbtnNewRadioButton = new JRadioButton("On");
			rdbtnNewRadioButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
								
					//enabling buttons
					button_22.setEnabled(true);
					button_21.setEnabled(true);
					button_20.setEnabled(true);
					button_19.setEnabled(true);
					button_18.setEnabled(true);
					button_17.setEnabled(true);
					button_16.setEnabled(true);
					button_15.setEnabled(true);
					button_14.setEnabled(true);
					button_13.setEnabled(true);
					button_12.setEnabled(true);
					button_11.setEnabled(true);
					button_10.setEnabled(true);
					button_9.setEnabled(true);
					button_8.setEnabled(true);
					button_7.setEnabled(true);
					button_6.setEnabled(true);
					button_5.setEnabled(true);
					button_4.setEnabled(true);
					button_3.setEnabled(true);
					button_2.setEnabled(true);
					button_1.setEnabled(true);
					button.setEnabled(true);
					
					//Welcome message
					System.out.println("Hello thank you for using my simple calulator.\r\n"
							+ "Things to know:\r\n"
							+ "\r\n"
							+ "1. SQRT=V on the calculator display\r\n"
							+ "2. The calculator does not do order of operations \r\n"
							+ "3. Square root can only be done alone i.e \r\n"
							+ "Works: Sqrt(64)\r\n"
							+ "Does not work: Sqrt(4)+1\r\n"
							+ "Please calculate the sqaure root then Press \"AC\", then \"ANS\" \r\n"
							+ "if you want to continue with your solution\r\n"
							+ "\r\n"
							+ "Enjoy!!");
				}
			});
			rdbtnNewRadioButton.setBounds(6, 111, 66, 23);
			contentPane.add(rdbtnNewRadioButton);

			
			
			JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Off");
			rdbtnNewRadioButton_1.setSelected(true);
			rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//clearing calculator
					display="";
		    		textField.setText(display);
		    		arr.clear();
		    		operationPressed=false;
		    		numPostOp="";
		    		size=0;
		    		
		    		//disables every button
		    		button_22.setEnabled(false);
					button_21.setEnabled(false);
					button_20.setEnabled(false);
					button_19.setEnabled(false);
					button_18.setEnabled(false);
					button_17.setEnabled(false);
					button_16.setEnabled(false);
					button_15.setEnabled(false);
					button_14.setEnabled(false);
					button_13.setEnabled(false);
					button_12.setEnabled(false);
					button_11.setEnabled(false);
					button_10.setEnabled(false);
					button_9.setEnabled(false);
					button_8.setEnabled(false);
					button_7.setEnabled(false);
					button_6.setEnabled(false);
					button_5.setEnabled(false);
					button_4.setEnabled(false);
					button_3.setEnabled(false);
					button_2.setEnabled(false);
					button_1.setEnabled(false);
					button.setEnabled(false);
				}
			});
			rdbtnNewRadioButton_1.setBounds(6, 134, 66, 23);
			contentPane.add(rdbtnNewRadioButton_1);
			
			 ButtonGroup group = new ButtonGroup();
			    group.add(rdbtnNewRadioButton);
			    group.add(rdbtnNewRadioButton_1);
			    
			   
			    
		
	}
}
