/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stuinfo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import jxl.*;  
import jxl.format.Alignment;  
import jxl.format.Border;  
import jxl.format.BorderLineStyle;  
import jxl.format.Colour;  
import jxl.format.VerticalAlignment;  
import jxl.write.Label;  
import jxl.write.WritableCellFormat;  
import jxl.write.WritableFont;  
import jxl.write.WritableSheet;  
import jxl.write.WritableWorkbook;  
import jxl.write.WriteException; 
import java.io.*;
/**
 *
 * @author zhang
 */
public class StuInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
           StudentsFrame frame=new StudentsFrame();
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setVisible(true);
        // TODO code application logic here
    }
}
    
    class StudentsFrame extends JFrame implements ActionListener
{
    
    public StudentsFrame()
    {
        setTitle("student information");
        setSize(400,400);
        ImageIcon img=new ImageIcon("IMG0303A.jpg");
        JLabel label = new JLabel(img);
        label.setBounds(20, 10,350, 280);
        this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
        JPanel imagePanel = (JPanel) this.getContentPane();
        imagePanel.setOpaque(false);
        JPanel panel=new JPanel();
        panel.setOpaque(false);
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel label1=new JLabel("欢迎进入学生信息管理系统");
        Font d1=new Font("楷体",Font.BOLD,30);
        label1.setFont(d1);
        Box box1=Box.createHorizontalBox();
        box1.add(label1);
        /*JLabel label2=new JLabel("请选择您要的操作");
        Font d2=new Font("隶书",Font.LAYOUT_LEFT_TO_RIGHT,20);
        label2.setFont(d2);
        Box box2=Box.createHorizontalBox();
        box2.add(label2);*/
        button1=new JButton("查找");
        button1.setBackground(Color.YELLOW);
        button2=new JButton("删除");
        button2.setBackground(Color.green);
        button3=new JButton("增加");
        button3.setBackground(Color.PINK);
        button4=new JButton("修改");
        button4.setBackground(Color.LIGHT_GRAY);
        Box box3=Box.createHorizontalBox();
        box3.add(button1);
        box3.add(Box.createGlue());
        box3.add(button2);
        box3.add(Box.createGlue());
        box3.add(button3);
        box3.add(Box.createGlue());
        box3.add(button4);
        
        Box box=Box.createVerticalBox();
        box.add(box1);
        box.add(Box.createGlue());
        //box.add(box2);
        box.add(Box.createGlue());
        box.add(box3);
        
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        
        
        add(box, BorderLayout.CENTER);
     
    }
    private JButton button1,button2,button3,button4;

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source=e.getSource();
        if(source==button3)
        {
            Add frame1=new Add();
            frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame1.setVisible(true);
        }
        if(source==button2)
        {
            Delete frame2=new Delete();
            frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame2.setVisible(true);
        }
        if(source==button1)
        {
            Search frame3=new Search();
            frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame3.setVisible(true);
        }
        if(source==button4)
        {
            Change frame3=new Change();
            frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame3.setVisible(true);
        }
       
    }
}
    class Add  extends JFrame implements ActionListener
{
        public Add()
        {
            setTitle("add information");
            setSize(350,350);
            
             ImageIcon img=new ImageIcon("e.jpg");
             JLabel label0 = new JLabel(img);
             label0.setBounds(0, 0,350, 350);
             this.getLayeredPane().add(label0, new Integer(Integer.MIN_VALUE));
             JPanel imagePanel = (JPanel) this.getContentPane();
             imagePanel.setOpaque(false);
             JPanel panel=new JPanel();
             panel.setOpaque(false);
             add(panel);
             setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JLabel label=new JLabel("请输入要增加的学生信息");
            Box zeng=Box.createHorizontalBox();
            zeng.add(Box.createHorizontalStrut(10));
            zeng.add(label);
            
            JLabel number=new JLabel("学号");
            tf1=new JTextField(10);
            tf1.setMaximumSize(tf1.getPreferredSize());
            Box boxnumber=Box.createHorizontalBox();
            boxnumber.add(number);
            boxnumber.add(Box.createHorizontalStrut(10));
            boxnumber.add(tf1);
            
            
            JLabel name=new JLabel("姓名");
            tf2=new JTextField(10);
            tf2.setMaximumSize(tf2.getPreferredSize());
            Box boxname=Box.createHorizontalBox();
            boxname.add(name);
            boxname.add(Box.createHorizontalStrut(10));
            boxname.add(tf2);
            
            JLabel sex=new JLabel("性别");
            tf3=new JTextField(10);
            tf3.setMaximumSize(tf3.getPreferredSize());
            Box boxsex=Box.createHorizontalBox();
            boxsex.add(sex);
            boxsex.add(Box.createHorizontalStrut(10));
            boxsex.add(tf3);
            
            JLabel type= new JLabel("学生类型");
            tf4=new JTextField(10);
            tf4.setMaximumSize(tf4.getPreferredSize());
            Box boxtype=Box.createHorizontalBox();
            boxtype.add(type);
            boxtype.add(Box.createHorizontalStrut(10));
            boxtype.add(tf4);
            
            
            JLabel banji= new JLabel("班级");
            tf5=new JTextField(10);
            tf5.setMaximumSize(tf5.getPreferredSize());
            Box boxclass=Box.createHorizontalBox();
            boxclass.add(banji);
            boxclass.add(Box.createHorizontalStrut(10));
            boxclass.add(tf5);
            
            JLabel grade= new JLabel("籍贯");
            tf6=new JTextField(10);
            tf6.setMaximumSize(tf6.getPreferredSize());
            Box boxgrade=Box.createHorizontalBox();
            boxgrade.add(grade);
            boxgrade.add(Box.createHorizontalStrut(10));
            boxgrade.add(tf6);
            
            ok=new JButton("OK");
            ok.addActionListener(this);
            cancel=new JButton("Cancel");
            cancel.addActionListener(this);
            Box box1=Box.createHorizontalBox();
            box1.add(ok);
            box1.add(Box.createGlue());
            box1.add(cancel);
          
            Box box=Box.createVerticalBox();
            box.add(zeng);
            box.add(Box.createGlue());
            box.add(boxnumber);
            box.add(Box.createGlue());
            box.add(boxname);
            box.add(Box.createGlue());
            box.add(boxsex);
            box.add(Box.createGlue());
            box.add(boxtype);
            box.add(Box.createGlue());
            box.add(boxclass);
            box.add(Box.createGlue());
            box.add(boxgrade);
            box.add(Box.createGlue());
            box.add(box1);
            
            
            
            add(box, BorderLayout.CENTER);

        }
        private JButton ok,cancel;
        private JTextField tf1,tf2,tf3,tf4,tf5,tf6;
        private WritableWorkbook book=null;

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source=e.getSource();
        if(source==ok)
        {
             try{
                
                Workbook wb=Workbook.getWorkbook(new File("学生信息.xls"));
                book=Workbook.createWorkbook(new File("学生信息.xls"), wb);
                Sheet sheet=book.getSheet(0);
                WritableSheet wsheet=book.getSheet(0);
                int colunm=sheet.getColumns();
                int row =sheet.getRows();
                Label label1=new Label(0,row,tf1.getText());
                wsheet.addCell(label1);
                Label label2=new Label(1,row,tf2.getText());
                wsheet.addCell(label2);
                Label label3=new Label(2,row,tf3.getText());
                wsheet.addCell(label3);
                Label label4=new Label(3,row,tf4.getText());
                wsheet.addCell(label4);
                Label label5=new Label(4,row,tf5.getText());
                wsheet.addCell(label5);
                Label label6=new Label(5,row,tf6.getText());
                wsheet.addCell(label6);
             
               
                book.write();
           }catch (Exception p) { 
               System.out.print(p);
           }finally{ 
              try {  
                     book.close();  
                  }catch(Exception o)
                  {
                     o.printStackTrace();
                  }
           }
            
        }
        if(source==cancel)
        {
            tf1.setText(" ");
            tf2.setText(" ");
            tf3.setText(" ");
            tf4.setText(" ");
            tf5.setText(" ");
            tf6.setText(" ");
           
        }
        
       
    }
}
    
    class Delete extends JFrame implements ActionListener
{
   public Delete()
   {
       setTitle("delete");
       setSize(350,350);
       
       ImageIcon img=new ImageIcon("e.jpg");
       JLabel label0 = new JLabel(img);
       label0.setBounds(0, 0,350, 350);
       this.getLayeredPane().add(label0, new Integer(Integer.MIN_VALUE));
       JPanel imagePanel = (JPanel) this.getContentPane();
       imagePanel.setOpaque(false);
       JPanel panel=new JPanel();
       panel.setOpaque(false);
       add(panel);
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       JLabel label1=new JLabel("请输入要删除学生的学号");
       Box box1=Box.createHorizontalBox();
       box1.add(Box.createHorizontalStrut(10));
       box1.add(label1);
       
       JLabel label2=new JLabel("学号");
       tf=new JTextField(10);
       tf.setMaximumSize(tf.getPreferredSize());
       Box box2=Box.createHorizontalBox();
       box2.add(label2);
       box2.add(Box.createHorizontalStrut(10));
       box2.add(tf);
       
       ok=new JButton("OK");
       ok.addActionListener(this);
       cancel=new JButton("Cancel");
       cancel.addActionListener(this);
       Box box3=Box.createHorizontalBox();
       box3.add(ok);
       box3.add(Box.createGlue());
       box3.add(cancel);
       
       Box box=Box.createVerticalBox();
       box.add(box1);
       box.add(Box.createGlue());
       box.add(box2);
       box.add(Box.createGlue());
       box.add(box3);
       
       add(box, BorderLayout.CENTER);
   
   }
   private JButton ok,cancel;
   private JTextField tf;
   private WritableWorkbook book=null;

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source=e.getSource();
        if(source==ok)
        {
             try{
                
                Workbook wb=Workbook.getWorkbook(new File("学生信息.xls"));
                book=Workbook.createWorkbook(new File("学生信息.xls"), wb);
                Sheet sheet=book.getSheet(0);
                WritableSheet wsheet=book.getSheet(0);
                int colunm=sheet.getColumns();
                int row =sheet.getRows();
                String[]str=new String[100];
                for(int i=0;i<row;i++)
                {
                    Cell c=sheet.getCell(0, i);
                    str[i]=c.getContents();
                }
                for(int i=0;i<row;i++)
                {
                    if(tf.getText().equals(str[i]))
                    {
                       for(int j=0;j<colunm;j++)
                       {
                           Label label=new Label(j,i,"");
                           wsheet.addCell(label);
                       }
                   
                    }
                }
         
                book.write();
           }catch (Exception p) { 
               System.out.print(p);
           }finally{ 
              try {  
                     book.close();  
                  }catch(Exception o)
                  {
                     o.printStackTrace();
                  }
           }
        }
        if(source==cancel)
        {
            tf.setText(" ");
            
        }
            
    }
}
    class Search extends JFrame implements ActionListener
{
    public Search()
    {
        setTitle("search information");
        setSize(350,350);
        ImageIcon img=new ImageIcon("e.jpg");
        JLabel label0 = new JLabel(img);
        label0.setBounds(0, 0,350, 350);
        this.getLayeredPane().add(label0, new Integer(Integer.MIN_VALUE));
        JPanel imagePanel = (JPanel) this.getContentPane();
        imagePanel.setOpaque(false);
        JPanel panel=new JPanel();
        panel.setOpaque(false);
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        JLabel label1=new JLabel("请输入您要查找学生的学号");
        tf1=new JTextField(10);
        tf1.setMaximumSize(tf1.getPreferredSize());
        Box box1=Box.createHorizontalBox();
        box1.add(label1);
        box1.add(Box.createHorizontalStrut(10));
        box1.add(tf1);
        
        JLabel label2=new JLabel("查找的结果如下：");
        Box box2=Box.createHorizontalBox();
        box2.add(label2);
        
        JLabel name=new JLabel("姓名");
        tf2=new JTextField(10);
        tf2.setMaximumSize(tf2.getPreferredSize());
        Box box3=Box.createHorizontalBox();
        box3.add(name);
        box3.add(Box.createHorizontalStrut(10));
        box3.add(tf2);
        
        JLabel sex= new JLabel("性别");
        tf3=new JTextField(10);
        tf3.setMaximumSize(tf3.getPreferredSize());
        Box box4=Box.createHorizontalBox();
        box4.add(sex);
        box4.add(Box.createHorizontalStrut(10));
        box4.add(tf3);
        
        JLabel type= new JLabel("学生类型");
        tf4=new JTextField(10);
        tf4.setMaximumSize(tf4.getPreferredSize());
        Box box5=Box.createHorizontalBox();
        box5.add(type);
        box5.add(Box.createHorizontalStrut(10));
        box5.add(tf4);
        
        JLabel banji= new JLabel("班级");
        tf5=new JTextField(10);
        tf5.setMaximumSize(tf5.getPreferredSize());
        Box box6=Box.createHorizontalBox();
        box6.add(banji);
        box6.add(Box.createHorizontalStrut(10));
        box6.add(tf5);
        
        JLabel grade= new JLabel("籍贯");
        tf6=new JTextField(10);
        tf6.setMaximumSize(tf6.getPreferredSize());
        Box box7=Box.createHorizontalBox();
        box7.add(grade);
        box7.add(Box.createHorizontalStrut(10));
        box7.add(tf6);
        
       ok=new JButton("OK");
       ok.addActionListener(this);
       cancel=new JButton("Cancel");
       cancel.addActionListener(this);
       Box box8=Box.createHorizontalBox();
       box8.add(ok);
       box8.add(Box.createGlue());
       box8.add(cancel);
       
       Box box=Box.createVerticalBox();
       box.add(box1);
       box.add(Box.createGlue());
       box.add(box2);
       box.add(Box.createGlue());
       box.add(box3);
       box.add(Box.createGlue());
       box.add(box4);
       box.add(Box.createGlue());
       box.add(box5);
       box.add(Box.createGlue());
       box.add(box6);
       box.add(Box.createGlue());
       box.add(box7);
       box.add(Box.createGlue());
       box.add(box8);
       
       add(box, BorderLayout.CENTER);
   
    }
    
    private JButton ok,cancel;
    private JTextField tf1,tf2,tf3,tf4,tf5,tf6;

    @Override
    public void actionPerformed(ActionEvent e){
        Object source =e.getSource();
        if(source==ok){
          try
            {
            
                  // FileInputStream file=new FileInputStream("学生信息.xls");
                   Workbook book=Workbook.getWorkbook(new File("学生信息.xls"));
                   
                   Sheet sh=book.getSheet(0);
                   int lieshu=sh.getColumns();
                   int hangshu=sh.getRows();
                   String[] str=new String[100];
             
                   for(int i=0;i<hangshu;i++)
                   {
                       Cell c=sh.getCell(0, i);
                       str[i]=c.getContents();
                      // System.out.print(str[i]);
                   }
                   
                   for(int i=0;i<hangshu;i++)
                   { 
                     
                       if(tf1.getText().equals(str[i]))
                       {
                           Cell c1=sh.getCell(1, i);
                           tf2.setText(c1.getContents());
                           Cell c2=sh.getCell(2, i);
                           tf3.setText(c2.getContents());
                           Cell c3=sh.getCell(3, i);
                           tf4.setText(c3.getContents());
                           Cell c4=sh.getCell(4, i);
                           tf5.setText(c4.getContents());
                           Cell c5=sh.getCell(5, i);
                           tf6.setText(c5.getContents());
                           //System.out.print(c1.getContents());
                           
                         
                       }
                   }
           
             }
             catch(Exception o)
             {
                 o.printStackTrace();
             }
        }
       
        if(source==cancel)
        {
            tf1.setText(" ");
            
            
        }
    }
}
        class Change extends JFrame implements ActionListener
{
    public Change()
    {
        setTitle("modify information");
        setSize(350,350);
        
        ImageIcon img=new ImageIcon("e.jpg");
        JLabel label0 = new JLabel(img);
        label0.setBounds(0, 0,350, 350);
        this.getLayeredPane().add(label0, new Integer(Integer.MIN_VALUE));
        JPanel imagePanel = (JPanel) this.getContentPane();
        imagePanel.setOpaque(false);
        JPanel panel=new JPanel();
        panel.setOpaque(false);
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel label1=new JLabel("请输入您要修改学生的学号");
        tf1=new JTextField(10);
        tf1.setMaximumSize(tf1.getPreferredSize());
        Box box1=Box.createHorizontalBox();
        box1.add(label1);
        box1.add(Box.createHorizontalStrut(10));
        box1.add(tf1);
        
        JLabel label2=new JLabel("修改的结果如下：");
        Box box2=Box.createHorizontalBox();
        box2.add(label2);
        
        JLabel name=new JLabel("姓名");
        tf2=new JTextField(10);
        tf2.setMaximumSize(tf2.getPreferredSize());
        Box box3=Box.createHorizontalBox();
        box3.add(name);
        box3.add(Box.createHorizontalStrut(10));
        box3.add(tf2);
        
        JLabel sex= new JLabel("性别");
        tf3=new JTextField(10);
        tf3.setMaximumSize(tf3.getPreferredSize());
        Box box4=Box.createHorizontalBox();
        box4.add(sex);
        box4.add(Box.createHorizontalStrut(10));
        box4.add(tf3);
        
        JLabel type= new JLabel("学生类型");
        tf4=new JTextField(10);
        tf4.setMaximumSize(tf4.getPreferredSize());
        Box box5=Box.createHorizontalBox();
        box5.add(type);
        box5.add(Box.createHorizontalStrut(10));
        box5.add(tf4);
        
        JLabel banji= new JLabel("班级");
        tf5=new JTextField(10);
        tf5.setMaximumSize(tf5.getPreferredSize());
        Box box6=Box.createHorizontalBox();
        box6.add(banji);
        box6.add(Box.createHorizontalStrut(10));
        box6.add(tf5);
        
        JLabel grade= new JLabel("籍贯");
        tf6=new JTextField(10);
        tf6.setMaximumSize(tf6.getPreferredSize());
        Box box7=Box.createHorizontalBox();
        box7.add(grade);
        box7.add(Box.createHorizontalStrut(10));
        box7.add(tf6);
        
       ok=new JButton("OK");
       ok.addActionListener(this);
       cancel=new JButton("Cancel");
       cancel.addActionListener(this);
       Box box8=Box.createHorizontalBox();
       box8.add(ok);
       box8.add(Box.createGlue());
       box8.add(cancel);
       
       Box box=Box.createVerticalBox();
       box.add(box1);
       box.add(Box.createGlue());
       box.add(box2);
       box.add(Box.createGlue());
       box.add(box3);
       box.add(Box.createGlue());
       box.add(box4);
       box.add(Box.createGlue());
       box.add(box5);
       box.add(Box.createGlue());
       box.add(box6);
       box.add(Box.createGlue());
       box.add(box7);
       box.add(Box.createGlue());
       box.add(box8);
       
       add(box, BorderLayout.CENTER);

    }
      
    private JTextField tf1,tf2,tf3,tf4,tf5,tf6;
    private JButton ok,cancel;
    private WritableWorkbook book=null;

    @Override
    public void actionPerformed(ActionEvent e) {
         Object source =e.getSource();
        if(source==ok)
        {
           try{
                
                Workbook wb=Workbook.getWorkbook(new File("学生信息.xls"));
                book=Workbook.createWorkbook(new File("学生信息.xls"), wb);
                Sheet sheet=book.getSheet(0);
                WritableSheet wsheet=book.getSheet(0);
                int colunm=sheet.getColumns();
                int row =sheet.getRows();
                String[]str=new String[100];
                for(int i=0;i<row;i++)
                {
                    Cell c=sheet.getCell(0, i);
                    str[i]=c.getContents();
                }
                for(int i=0;i<row;i++)
                {
                    if(tf1.getText().equals(str[i]))
                    {
                        Label label1=new Label(1,i,tf2.getText());
                        wsheet.addCell(label1);
                        Label label2=new Label(2,i,tf3.getText());
                        wsheet.addCell(label2);
                        Label label3=new Label(3,i,tf4.getText());
                        wsheet.addCell(label3);
                        Label label4=new Label(4,i,tf5.getText());
                        wsheet.addCell(label4);
                        Label label5=new Label(5,i,tf6.getText());
                        wsheet.addCell(label5);
                       
                    }
                    
                }
                book.write();
           }catch (Exception p) { 
               System.out.print(p);
           }finally{ 
              try {  
                     book.close();  
                  }catch(Exception o)
                  {
                     o.printStackTrace();
                  }
           }
        }
        if(source==cancel)
        {
            tf1.setText(" ");
            
        }
        
    }
        }   
    

