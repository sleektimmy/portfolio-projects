
package phone;



import java.util.*;
import javax.swing.*;
import java.io.*;

class Student
{

	ArrayList<Student> Std ;
	public Student()
	{
		Std = new ArrayList<Student> ();
		loadRecord();

	}

        String name;
	    String phoneNum;
	

	public Student(String n, String r)
	{
		name = n;
		phoneNum = r;
		
	}
public String getrollNum()
{ return phoneNum ; }

public String getname()
{ return name ; }



	public void print()
	{
		JOptionPane.showMessageDialog(null,"Name : " + name + "\nNumber : " + phoneNum);
	}

	// function to load record from file
	public void loadRecord()
	{
		String tokens[] =null;
		String name,ph;
		try
		{
			FileReader fr = new FileReader("record.txt");
			BufferedReader br = new BufferedReader(fr);

			String s = br.readLine();
			while(s != null)
			{
				tokens = s.split(",");
				name = tokens[0];
				ph = tokens[1];
				Student student = new Student(name, ph);
				Std.add(student);
				s = br.readLine();
			}

		}
		catch(IOException e)
		{
			System.out.println("Unable to find file");
		}
	}

    
	public void add()
	{ 


		String name = JOptionPane.showInputDialog("Enter the name : " );
        if(name == null){
            System.exit(0);}
        

		String phoneNum = JOptionPane.showInputDialog("Enter Number : ");
		
        
       
            if(phoneNum == null){

                System.exit(0);
                

            }
            else{
                Student p = new Student(name, phoneNum);
		        Std.add(p);
            }
        }

    
   
       
		
	

	// function to search record from ArrayList
	public void Search(String n)
	{
		for (int i =0; i<Std.size(); i++) {
			Student p = Std.get(i);
			if(n.equals(p.name))
			{
				p.display();}
            else{
             errorMessage();  }}
		
    }  
       
    public void errorMessage(){
        JOptionPane.showMessageDialog(null, "Record does not exist",
        "Invalid", JOptionPane.ERROR_MESSAGE);
  
    }

     // Display all record
	public void DisplayAll()
	{
		for (int i =0; i<Std.size(); i++) {
			Student p = Std.get(i);
			
			p.print();
			
		}
	}
        
    
    void display(){
        JOptionPane.showMessageDialog(null, "Name: " + name +" " +
        
        "\nPhone Number : " + phoneNum);
    }
  
        
    
    // function to delete record from ArrayList
	public void Delete(String n)
	{
		for (int i =0; i<Std.size(); i++) {
			Student p = Std.get(i);
			if(n.equals(p.name))
			{
				Std.remove(i);
                JOptionPane.showMessageDialog(null, "Contact Removed");
			}

            else if(!n.equals(p.name)){
                errorMessage();  
            }
			
		}
	}
    
    // function to save record on file
	public void saveRecord()
	{
		try
		{
			FileWriter fw = new FileWriter("record.txt");
			PrintWriter pw = new PrintWriter(fw);
			String ss = "";
			for (int i =0; i<Std.size(); i++ ) 
			{
				Student student = Std.get(i);
				ss = student.name + "," + student.phoneNum;
				pw.println(ss);

			}
			pw.close();
			fw.close();


		}
		catch(IOException e)
		{
			System.out.println("Unable to write");
		}
	}

}

public class Phone extends javax.swing.JFrame {
    String  input, i;
    Student S = new Student();
   
  
    public Phone() {
        initComponents();
    }

   
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        
    
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CPE20181112");
        setBackground(new java.awt.Color(0, 120, 100));
        setBounds(new java.awt.Rectangle(400, 100, 0, 0));
        setName("frame"); // 
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0,0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 0, 102));
        jLabel1.setFont(new java.awt.Font("Poppins", 0, 24)); 
        jLabel1.setForeground(new java.awt.Color(205, 25, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
         
        ImageIcon icon = new ImageIcon("contacts-icon.png");
       
        jLabel1.setText("My Phone Directory");
        jLabel1.setIcon(icon);
        

        jButton1.setBackground(new java.awt.Color(215, 215, 255));
        jButton1.setFont(new java.awt.Font("Poppins", 0, 10));
        
        jButton1.setText("Add Contact");
        jButton1.setSize(60,60);
        
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jButton2.setText("Search Contact");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jButton3.setText("Delete Contact");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jButton4.setText("Display Contacts");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jButton6.setText("About");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(25, 51, 255));
        jButton5.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

      


       
     javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, true)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(70, 70, 70)

                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(70, 70, 70)
                                            
                                        
                                       
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                )))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, true)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(20, 20, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(36, 36, 36)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        S.add();
        JOptionPane.showMessageDialog(null, "Contact Added Successfully");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        i = JOptionPane.showInputDialog("Enter name to search");
 		S.Search(i);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        i = JOptionPane.showInputDialog("Enter name to delete");
 		S.Delete(i);
                
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
       S.saveRecord();
       Table t = new Table();
       t.setVisible(true);
       setVisible(false);
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        S.saveRecord();
 		System.exit(0);
    }

    
  public void jButton6ActionPerformed(java.awt.event.ActionEvent evt){
    JOptionPane.showMessageDialog(null,"Author: Yusuf Timileyin \nMat No: CPE/2018/1112 \nProgram Version: PhoneBook 1.0");
    System.exit(0);
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
            java.util.logging.Logger.getLogger(Phone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Phone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Phone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Phone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Phone().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
