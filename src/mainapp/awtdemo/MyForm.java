package mainapp.awtdemo;

import java.awt.*;

public class MyForm extends Frame {
    private Label lblname,lblgender,lblcourse,lblremarks,lblcountry,lbllist;
    private TextField txtname;
    private Checkbox ckbmale, ckbfemale, cbbasic,cbadvanced;
    private CheckboxGroup ckbgender= new CheckboxGroup();

    private TextArea taremarks=new TextArea(5,15);
    private Choice choiceCountry;
    private List list;
    private Button btnok;

    public MyForm(){
        lblname=new Label("Fullname:");
        lblgender=new Label("Gender:");
        lblcourse=new Label("Course:");
        lblremarks=new Label("Remarks:");
        lblcountry=new Label("Country:");
        lbllist=new Label("List:");

        txtname=new TextField(15);
        ckbmale=new Checkbox("Male",ckbgender,true);
        ckbfemale=new Checkbox("Female",ckbgender,false);

        cbbasic=new Checkbox("Basic",false);
        cbadvanced=new Checkbox("Advanced",false);

        choiceCountry=new Choice();
        choiceCountry.addItem("Nepal");
        choiceCountry.addItem("India");
        choiceCountry.addItem("China");

        list=new List();
        list.add("List one");
        list.add("List two");

        btnok=new Button("Submit Button");

        setVisible(true);
        setSize(250,500);
        setTitle("My Form");
        setLayout(new FlowLayout());

        //add components
        add(lblname);
        add(txtname);

        add(lblgender);
        add(ckbmale);
        add(ckbfemale);

        add(lblcourse);
        add(cbbasic);
        add(cbadvanced);

        add(lblremarks);
        add(taremarks);

        add(lblcountry);
        add(choiceCountry);

        add(lbllist);
        add(list);

        add(btnok);
    }

    public static void main(String[] args) {
        new MyForm();
    }
}
