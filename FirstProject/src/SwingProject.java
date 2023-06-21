// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class SwingProject implements ActionListener {
//     JFrame window;

//     JButton chameli,Chamela;

//     Boolean B=true;

//     SwingProject()
//     {
//         window=new JFrame("First Frame");
//         window.setLayout(null);
//         window.setSize(500,300);
//         window.setLocation(600,400);

//         chameli=new JButton("Click");
//         Chamela=new JButton("Click2");


//         Chamela.addActionListener(this);
//         chameli.addActionListener(this);

//         Chamela.setSize(100,50);
//         Chamela.setLocation(200,0);
//         chameli.setSize(100,50);

//         window.add(chameli);
//         window.add(Chamela);

//         window.setVisible(true);
//     }


//     public static void main(String[] args) {
//          SwingProject obj =new SwingProject();


// //        Swing_Learning[] obj=new Swing_Learning[5];
// //
// //        for(int i=0;i<obj.length;i++)
// //        {
// //            obj[i]=new Swing_Learning();
// //        }
//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {
//         String s=e.getActionCommand();
//         if(s.equals("Click") && B==true)
//         {
//             window.getContentPane().setBackground(Color.blue);
//             B=false;
//         }else if(s.equals("Click")){
//             B=true;
//             window.getContentPane().setBackground(Color.yellow);
//         }
//     }
// }