//Problem Statement: Write java program to create a registration form using AWT
import java.awt.*;
import java.awt.event.*;


public class RegistrationForm extends Frame implements ActionListener{
    String msg;
    Button b1 = new Button("Save");
    Label l1  = new  Label("Students Details", Label.CENTER);
    Label l2 = new Label("Name: ", Label.LEFT);
    Label l3 = new Label("Age: ", Label.LEFT);
    Label l4 = new Label("Sex :",Label.LEFT);
    Label l5 = new Label("Address: ", Label.LEFT);
    Label l6 = new Label("Course: ", Label.LEFT);
    Label l7 = new Label("Semester: ", Label.LEFT);
    Label l8 = new Label("",Label.RIGHT);

    TextField t1 = new TextField();
    Choice c1 = new Choice();
    CheckboxGroup cbg = new CheckboxGroup();
    Checkbox ck1 = new Checkbox("Male", false,cbg);
    Checkbox ck2 = new Checkbox("Female", false, cbg);
    TextArea t2 = new TextArea("", 180, 90, TextArea.SCROLLBARS_VERTICAL_ONLY);
    Choice course = new Choice();
    Choice sem = new Choice();
    Choice age = new Choice();
    public RegistrationForm(){
        setBackground(Color.cyan);
        setForeground(Color.black);
        setLayout(null);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        add(t1);
        add(t2);
        add(ck1);
        add(ck2);
        add(course);
        add(sem);
        add(age);
        add(b1);
        b1.addActionListener(this);
        course.add("Java");
        course.add("DSA");
        course.add("LD");
        sem.add("3");
        sem.add("4");
        age.add("18");
        age.add("19");
        l1.setBounds(10,40,280,20);
        l2.setBounds(25,65,90,20);
        l3.setBounds(25,90,90,20);
        l4.setBounds(25,120,90,20);
        l5.setBounds(25,185,90,20);
        l6.setBounds(25,260,90,20);
        l7.setBounds(25,290,90,20);
        l8.setBounds(25,260,90,20);
        t1.setBounds(120,65,170,20);
        t2.setBounds(120,185,170,60);
        ck1.setBounds(120,120,50,20);
        ck2.setBounds(170,120,60,20);
        course.setBounds(120,260,100,20);
        sem.setBounds(120,290,50,20);
        age.setBounds(120,90,50,20);
        b1.setBounds(120,350,50,30);


    }
    public void paint(Graphics g){
        g.drawString(msg,200,450);

    }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Save")){
            msg = "Student details saved";
            setForeground(Color.red);
        }
		
	}
    public static void main(String args[]){
        RegistrationForm r = new RegistrationForm();
        r.setSize(new Dimension(500,500));
        r.setTitle("Student registration");
        r.setVisible(true);

    }



}

class myWindowAdapter extends WindowAdapter{
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}