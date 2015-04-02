import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyOrder extends JApplet implements ActionListener{
//  private JButton pictureButton;
  private Border border;
  private JPanel p1;
  private JPanel pIntro;
  private JPanel pDish;
  private JPanel pSum;
  private JPanel pPerson;
  private JPanel pPrice;
  private JPanel pCalculate;
  private JPanel pGender;
  private JPanel pDrink;
  private JPanel pSelect;
  private JList jlst;
  private JList listm;
  private Icon background;
  private Icon picture;
  private JButton pictureButton1;
  private JButton pictureButton2;
  private JButton pictureButton3;
  private JButton pictureButton4;
  private JButton pictureButton5;
  private JButton pictureButton6;
  private JButton pictureButton7;
  private JButton pictureButton8;
  private JButton bclear;
  private JCheckBox delivery;
  
  private JRadioButton jr1;
  private JRadioButton jr2;
  private JScrollPane jScroll;
  private JScrollPane jsDrink;
  private JComboBox jcbSauce;
  private double dishPrice;
  private double totalPrice=0.0;
  private double subTotal =0.0;
  private double taxRate =0.1;
  private double taxFee=0.0;
  private JTextField sum;
  private JTextField sub;
  private JTextField tax;
  private JTextField deliveryFee;
  private double num1;
  private double dfee=4.0;   // delivery fee
  private DefaultListModel listModel;
  private Dish d1;
  private Dish d2;
  private Dish d3;
  private Dish d4;
  private Dish d5;
  private Dish d6;
  private Dish d7;
  private Dish d8;
  private Dish d9;

  private ButtonGroup gender;
  private final String[] contents={"Accounting", "Business Manage","Economics",
 	     "Music", "Nursing","Law",
 	     "Film Production","Computer Science", "Art Manage"};; 
  
  @SuppressWarnings({ "unchecked", "rawtypes" })
public MyOrder() {
    
	p1 = new JPanel();
	p1.setBackground(Color.YELLOW);
    p1.setLayout(new BorderLayout(5,10));
    add(p1);
    
    try{
    	background= new ImageIcon(this.getClass().getResource("/image/bkground.jpg"));
	} catch(Exception e){}
    JLabel name= new JLabel("The bookstore of Oklahoma City University", JLabel.CENTER);
	border = new MatteBorder(20,20,20,20,background);
	name.setBorder(border);
	p1.add(name,BorderLayout.NORTH);
    
    
    p1.add(new JButton("Thanks for your order."),BorderLayout.SOUTH);
    
    pIntro=new JPanel();
    pIntro.setLayout(new GridLayout(6,1,1,1));
    pIntro.add(new JLabel("Please choose your book: "));
    pIntro.add(new JLabel());
    
    pIntro.add(new JLabel("Please choose the free gift: "));
    
    jcbSauce = new JComboBox(new Object[]
    		{"chewing gum","pencil", "rubber", "paster", "postcard"});
    jcbSauce.setForeground(Color.red);
    jcbSauce.setBackground(Color.white);
    jcbSauce.setSelectedItem("chewing gum");
    pIntro.add(jcbSauce);
    
    pIntro.add(new JLabel("Please choose your major: "));
    
    pDrink =new JPanel();
    pDrink.setLayout(new GridLayout(10,1,1,1));
    
    final DefaultListModel items = new DefaultListModel();
    final JList lst = new JList(items);
    for(int i=0;i<contents.length;i++){
    	items.addElement(contents[i]);
    }   
    jsDrink = new JScrollPane(lst);
    jsDrink.setBounds(10,10,100,100);
    
    pIntro.add(jsDrink);  
    
    p1.add(pIntro,BorderLayout.WEST);
    
    pDish=new JPanel();
    pDish.setLayout(new GridLayout(9,1,5,5));
   
    
    d1=new Dish("1",10.5);
    findPic(d1);
    pictureButton1 = new JButton("Book "+d1.getName()+"  $"+d1.getPrice(),picture);
    setPicButton(d1,pictureButton1);
    pictureButton1.addActionListener(this);
    pDish.add(pictureButton1);

    d2=new Dish("2",12.5);
    findPic(d2);
    pictureButton2 = new JButton("Book "+d2.getName()+"  $"+d2.getPrice(),picture);
    setPicButton(d2,pictureButton2);
    pictureButton2.addActionListener(this);
    pDish.add(pictureButton2);
    
    d3=new Dish("3",10.0);
    findPic(d3);
    pictureButton3 = new JButton("Book "+d3.getName()+"  $"+d3.getPrice(),picture);
    setPicButton(d3,pictureButton3);
    pictureButton3.addActionListener(this);
    pDish.add(pictureButton3);
    
    d4=new Dish("4",14.0);
    findPic(d4);
    pictureButton4 = new JButton("Book "+d4.getName()+"  $"+d4.getPrice(),picture);
    setPicButton(d4,pictureButton4);
    pictureButton4.addActionListener(this);
    pDish.add(pictureButton4);

    d5=new Dish("5",12.5);
    findPic(d5);
    pictureButton5 = new JButton("Book "+d5.getName()+"  $"+d5.getPrice(),picture);
    setPicButton(d5,pictureButton5);
    pictureButton5.addActionListener(this);
    pDish.add(pictureButton5);

    d6=new Dish("6",11.0);
    findPic(d6);
    pictureButton6 = new JButton("Book "+d6.getName()+"  $"+d6.getPrice(),picture);
    setPicButton(d6,pictureButton6);
    pictureButton6.addActionListener(this);
    pDish.add(pictureButton6);
    
    d7=new Dish("7",12.0);
    findPic(d7);
    pictureButton7 = new JButton("Book "+d7.getName()+"  $"+d7.getPrice(),picture);
    setPicButton(d7,pictureButton7);
    pictureButton7.addActionListener(this);
    pDish.add(pictureButton7);
    
    d8=new Dish("8",13.0);
    findPic(d8);
    pictureButton8 = new JButton("Book "+d8.getName()+"  $"+d8.getPrice(),picture);
    setPicButton(d8,pictureButton8);
    pictureButton8.addActionListener(this);
    pDish.add(pictureButton8);
    
    
    jScroll = new JScrollPane(pDish);
    p1.add(jScroll, BorderLayout.CENTER);
   
    // Add labels and text fields to the frame
   
    pSum = new JPanel();
    pSum.setLayout(new GridLayout(6,1,1,1));
    
    pSum.add(new JLabel("customer information: "));
    
    pPerson = new JPanel();
    pPerson.setLayout(new GridLayout(5,2,1,1));
    
    
    jr1=new JRadioButton("Mr");
    jr2=new JRadioButton("Ms");
    gender =new ButtonGroup(); 
    gender.add(jr1);
    gender.add(jr2);   // add 2 radio button into one group
    
    pGender = new JPanel();
    pGender.setLayout(new BoxLayout(pGender, BoxLayout.LINE_AXIS));

    pGender.add(jr1);
    pGender.add(jr2);
    pPerson.add(new JLabel("Gender"));
    pPerson.add(pGender);
    
    
    pPerson.add(new JLabel("First Name"));
    pPerson.add(new JTextField(8));
    pPerson.add(new JLabel("Last Name"));
    pPerson.add(new JTextField(8));
    pPerson.add(new JLabel("phone number"));
    pPerson.add(new JTextField(8));
    pPerson.add(new JLabel("delivery addr."));
    pPerson.add(new JScrollPane(new JTextArea()));
    pSum.add(pPerson);
    
    pSum.add(new JLabel("order summary: "));
    JPanel pDisplay = new JPanel();
    pDisplay.setLayout(new BorderLayout());
    
    
    pPrice=new JPanel();
    pPrice.setLayout(new GridLayout(4,1,1,1)); 
    pPrice.add(new JLabel("Book"));
    pPrice.add(new JLabel("Number"));
    pPrice.add(new JLabel("Price"));
    pPrice.add(new JLabel("Remove"));
    pDisplay.add(pPrice);
    
    listModel = new DefaultListModel();
    listm = new JList(listModel);
    listModel.addElement(d1.getName());//--------------------------------------
    listModel.addElement(d1.getPrice());
    pSum.add(pPrice);
    
    pSelect = new JPanel();
    pSelect.setLayout(new GridLayout(4,1,1,1)); 
   /* listModel = new DefaultListModel();
    listm = new JList(listModel);
    listModel.addElement(d1.getName());//--------------------------------------
    listModel.addElement(d1.getPrice()); */
    
   // pSum.add(listm); 
    
    
    
    
    pCalculate=new JPanel();
    pCalculate.setLayout(new GridLayout(4,2,1,1));
    pCalculate.add(new JLabel("subtotal"));   // sub-total 
    sub = new JTextField(10);
    sub.setText("0.0");
    pCalculate.add(sub);  
    
    pCalculate.add(new JLabel("tax"));  // tax
    tax = new JTextField(10);
    tax.setText("0.0");
    pCalculate.add(tax);
    
    delivery = new JCheckBox("delivery");
    delivery.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		setDelivery();
    	}
     });    
    pCalculate.add(delivery);  // delivery
    deliveryFee = new JTextField(10);
    deliveryFee.setText("0.0");
    pCalculate.add(deliveryFee);
    
    pCalculate.add(new JLabel("total price"));   // total
    sum = new JTextField(10);
    sum.setText("0.0");
    pCalculate.add(sum);
    
    pSum.add(pCalculate);
    bclear = new JButton("Clear");
    bclear.addActionListener(new ActionListener(){
    	public void actionPerformed(ActionEvent a){
    		clear();
    	}
    });
    pSum.add(bclear);
    p1.add(pSum,BorderLayout.EAST);
    
  }
     
   public void findPic(Dish d){  // method: find pic path,create imageIcon
	 try{
		 String picPath ="/image/"+d.getName()+".jpg";
	     picture = new ImageIcon(this.getClass().getResource(picPath));
	} catch(Exception e){}
   }
   
   public void setPicButton(Dish d,JButton pb){  //method: set pic button font
	   pb.setVerticalTextPosition(SwingConstants.BOTTOM);
	   pb.setHorizontalTextPosition(SwingConstants.CENTER);
	   pb.setFont(new Font("Sans",Font.BOLD,12));  
   }  
   
   public void actionPerformed(ActionEvent ae){  // action: choose dish, add price
	   if(ae.getSource()==pictureButton1){
		   subTotal += Double.parseDouble(pictureButton1.getText().substring(9));
		   addition();
		   listModel.addElement(d1.getName());
	   }if(ae.getSource()==pictureButton2){
		   subTotal += Double.parseDouble(pictureButton2.getText().substring(9));
		   addition();
	   }if(ae.getSource()==pictureButton3){
		   subTotal += Double.parseDouble(pictureButton3.getText().substring(9));
		   addition();
	   }if(ae.getSource()==pictureButton4){
		   subTotal += Double.parseDouble(pictureButton4.getText().substring(9));
		   addition();
	   }if(ae.getSource()==pictureButton5){
		   subTotal += Double.parseDouble(pictureButton5.getText().substring(9));
		   addition();
	   }if(ae.getSource()==pictureButton6){
		   subTotal += Double.parseDouble(pictureButton6.getText().substring(9));
		   addition();
	   }if(ae.getSource()==pictureButton7){
		   subTotal += Double.parseDouble(pictureButton7.getText().substring(9));
		   addition();
	   }if(ae.getSource()==pictureButton8){
		   subTotal += Double.parseDouble(pictureButton8.getText().substring(9));
		   addition();
	   }
   }   
 
   public void addition(){ // method: set order price
       sub.setText("$ " + subTotal);
       taxFee=subTotal*taxRate;
       tax.setText("$ "+(""+taxFee).substring(0,5));
       totalPrice=subTotal+taxFee;
       sum.setText("$ "+totalPrice);
   }
   private void setDelivery() {  // calculate and add delivery fee
	  if(delivery.isSelected()){
		deliveryFee.setText("$ "+dfee);
		totalPrice +=dfee;
		sum.setText("$ "+totalPrice);
	  }else{
		deliveryFee.setText("$ "+0.0);
		totalPrice -=dfee;
		sum.setText("$ "+(totalPrice));
	  }
   }
   
   public void clear(){  // method: initial all calculated data 
	    sub.setText("0.0");
		tax.setText("0.0");
		deliveryFee.setText("0.0");
		sum.setText("0.0");
		subTotal=0.0;
		taxFee=0.0;
		totalPrice=0.0;
		
   }
   
   public class Dish{  // dish class
	   private double dishPrice;
	   private String dishName;
	   
	   public Dish(String name,double price){   // constructor 
		   dishName = name;
		   dishPrice = price;
	   }
	  	   
	   public double getPrice(){  // get price
		   return dishPrice;
	   }
	   
	   public String getName(){  // get name
		   return dishName;
	   }
   }
}

