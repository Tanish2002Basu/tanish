import java.applet.*;
import java.awt.event.*;
import java.awt.*;
public class ptsd extends Applet implements ActionListener 
{static {
    
	Label l1,l2,l3;
	TextField t1,t2;
	Button b1;
	public void init()
{
    
		l1=new Label("Enter 1st Number");
		l2=new Label("Enter 2nd Number");
		l3=new Label();
		t1=new TextField();
		t2=new TextField();
		b1=new Button("Submit");
	add(l2);
	add(l1);
	add(l3);
	add(t1);
	add(t2);
	add(b1);
	setLayout(null);
	l1.setBounds(100,50,100,100);
	t1.setBounds(220,90,150,40);
	l2.setBounds(100,120,100,100);
	t2.setBounds(220,165,150,40);
	b1.setBounds(100,240,150,40);
	l3.setBounds(100,280,100,100);
	b1.addActionListener(this);
	t1.addActionListener(this);
	t2.addActionListener(this);
}

		public void actionPerformed(ActionEvent e)
{
			int a,b,c;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			c=a+b;
			l3.setText("Ans = "+c);
		}

        public Label getL1() {
            return l1;
        }

        public void setL1(Label l1) {
            this.l1 = l1;
        }

        public Label getL2() {
            return l2;
        }

        public void setL2(Label l2) {
            this.l2 = l2;
        }

        public Label getL3() {
            return l3;
        }

        public void setL3(Label l3) {
            this.l3 = l3;
        }

        public TextField getT1() {
            return t1;
        }

        public void setT1(TextField t1) {
            this.t1 = t1;
        }

        public TextField getT2() {
            return t2;
        }

        public void setT2(TextField t2) {
            this.t2 = t2;
        }

        public Button getB1() {
            return b1;
        }

        public void setB1(Button b1) {
            this.b1 = b1;
        }
}
}




/*<applet code="ptsd" height="1000" width="1000"></applet>*/