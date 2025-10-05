import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorApplication {

    JFrame frame = new JFrame("Calculator Project");
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton (".") ;
    JButton buttonClear = new JButton ("AC") ;
    JButton buttonEqual = new JButton ("=");
    JButton buttonMul = new JButton ("\u00D7") ;
    JButton buttonDiv = new JButton ("\u00F7") ;
    JButton buttonPlus = new JButton ("+") ;
    JButton buttonMinus = new JButton ("-") ;
    JButton buttonSqrt = new JButton ("\u221Ax");
    JButton mcButton = new JButton ("mc") ;
    JButton mrButton = new JButton ("mr") ;
    JButton mPlusButton = new JButton ("m+") ;
    JButton mMinusButton = new JButton ("m-") ;
    JButton piNumberButton = new JButton ("\u03C0") ;   
    JButton expButton = new JButton ("x\u02B8") ;
    JButton toggleSiButton = new JButton ("+/-") ;
    JButton RTwoButton = new JButton ("R2") ;
    JButton RZeroButton = new JButton ("R0") ;
    JButton percentButton = new JButton ("%") ;

        


    public CalculatorApplication() {
        prepareGUI();
        addComponents();
        addListeners();
        // show frame after components are added so they render immediately
        frame.setVisible(true);
    }

    // Calculator state
    private double firstOperand = 0;
    private String operator = ""; // "+", "-", "*", "/"
    private boolean startNewNumber = true;
    private double memory = 0.0;

    public void prepareGUI(){
        frame.setSize(260, 420);
        frame.setLayout(null);
        frame.setResizable(false);
    // set the background on the content pane (JFrame itself doesn't expose setOpaque)
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public void addComponents(){
        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.WHITE);
        
        frame.add(label);

        textField.setBounds(10, 40, 240, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);
    

        ButtonGroup buttonGroup = new ButtonGroup();


        mcButton.setBounds(10,90, 60, 35);
        mcButton.setFont(new Font("Arial",Font.PLAIN, 12));
        mcButton.setBackground(Color.GRAY);
        mcButton.setForeground(Color.black);
        mcButton.setFocusable(false);
        frame.add(mcButton);

        mrButton.setBounds(70,90, 60, 35);
        mrButton.setFont(new Font("Arial",Font.PLAIN, 12));
        mrButton.setBackground(Color.GRAY);
        mrButton.setForeground(Color.black);
        mrButton.setFocusable(false);
        frame.add(mrButton);
        

        mMinusButton.setBounds(130,90, 60, 35);
        mMinusButton.setFont(new Font("Arial",Font.PLAIN, 12));
        mMinusButton.setBackground(Color.GRAY);
        mMinusButton.setForeground(Color.black);
        mMinusButton.setFocusable(false);
        frame.add(mMinusButton);

        mPlusButton.setBounds(190,90, 60, 35);
        mPlusButton.setFont(new Font("Arial",Font.PLAIN, 12));
        mPlusButton.setBackground(Color.GRAY);
        mPlusButton.setForeground(Color.black);
        mPlusButton.setFocusable(false);
        frame.add(mPlusButton);

        buttonClear.setBounds(10, 125, 60, 40);
        buttonClear.setFont(new Font("Arial",Font.BOLD, 15));
        buttonClear.setBackground(new Color(220, 220, 220));
        buttonClear.setForeground(Color.black);
        buttonClear.setFocusable(false);
        frame.add(buttonClear);

        buttonSqrt.setBounds(70,125,60,40);
        buttonSqrt.setFont(new Font("Arial",Font.BOLD, 18));
        buttonSqrt.setFocusable(false);
        frame.add(buttonSqrt);
        
        percentButton.setBounds(130,125,60,40);
        percentButton.setFont(new Font("Arial",Font.BOLD, 18));
        percentButton.setFocusable(false);
        frame.add(percentButton);

        buttonDiv.setBounds(190, 125, 60, 40);
        buttonDiv.setFont(new Font("Arial",Font.BOLD, 20));
        buttonDiv.setBackground(Color.YELLOW); // for some reason it is not turning yellow
        buttonDiv.setFocusable(false);
        frame.add(buttonDiv); 

        buttonSeven.setBounds(10,165, 60, 40);
        buttonSeven.setFont(new Font("Arial",Font.BOLD, 20));
        buttonSeven.setFocusable(false);
        frame.add(buttonSeven);

        buttonEight.setBounds(70,165, 60, 40);
        buttonEight.setFont(new Font("Arial",Font.BOLD, 20));
        buttonEight.setFocusable(false);
        frame.add(buttonEight);

        buttonNine.setBounds(130,165, 60, 40);
        buttonNine.setFont(new Font("Arial",Font.BOLD, 20));
        buttonNine.setFocusable(false);
        frame.add(buttonNine);

        buttonMul.setBounds(190, 165,60,40);
        buttonMul.setFont(new Font("Arial",Font.BOLD, 20));
        buttonMul.setBackground(new Color(239, 188, 2));
        buttonMul.setFocusable(false);
        frame.add(buttonMul);

        buttonFour.setBounds(10,205, 60, 40);
        buttonFour.setFont(new Font("Arial",Font.BOLD, 20));
        buttonFour.setFocusable(false);
        frame.add(buttonFour);

        buttonFive.setBounds(70,205, 60, 40);
        buttonFive.setFont(new Font("Arial",Font.BOLD, 20));
        buttonFive.setFocusable(false);
        frame.add(buttonFive);

        buttonSix.setBounds(130,205, 60, 40);
        buttonSix.setFont(new Font("Arial",Font.BOLD, 20));
        buttonSix.setFocusable(false);
        frame.add(buttonSix);

        buttonMinus.setBounds(190, 205,60,40);
        buttonMinus.setFont(new Font("Arial",Font.BOLD, 20));
        buttonMinus.setBackground(new Color(239, 188, 2));
        buttonMinus.setFocusable(false);
        frame.add(buttonMinus);

        buttonOne.setBounds(10,245, 60, 40);
        buttonOne.setFont(new Font("Arial",Font.BOLD, 20));
        buttonOne.setFocusable(false);
        frame.add(buttonOne);

        buttonTwo.setBounds(70,245, 60, 40);
        buttonTwo.setFont(new Font("Arial",Font.BOLD, 20));
        buttonTwo.setFocusable(false);
        frame.add(buttonTwo);

        buttonThree.setBounds(130,245, 60, 40);
        buttonThree.setFont(new Font("Arial",Font.BOLD, 20));
        buttonThree.setFocusable(false);
        frame.add(buttonThree);

        buttonPlus.setBounds(190, 245,60,40);
        buttonPlus.setFont(new Font("Arial",Font.BOLD, 20));
        buttonPlus.setBackground(new Color(239, 188, 2));
        buttonPlus.setFocusable(false);
        frame.add(buttonPlus);

        buttonZero.setBounds(10,285, 60, 40);
        buttonZero.setFont(new Font("Arial",Font.BOLD, 20));
        buttonZero.setFocusable(false);
        frame.add(buttonZero);

        buttonDot.setBounds(70,285, 60, 40);
        buttonDot.setFont(new Font("Arial",Font.BOLD, 20));
        buttonDot.setFocusable(false);
        frame.add(buttonDot);

        toggleSiButton.setBounds(130,285, 60, 40);
        toggleSiButton.setFont(new Font("Arial",Font.PLAIN, 20));
        toggleSiButton.setFocusable(false);
        frame.add(toggleSiButton);

        buttonEqual.setBounds(190, 285,60,40);
        buttonEqual.setFont(new Font("Arial",Font.BOLD, 20));
        buttonEqual.setBackground(new Color(239, 188, 2));
        buttonEqual.setFocusable(false);
        frame.add(buttonEqual);

        piNumberButton.setBounds(10,325, 60, 40);
        piNumberButton.setFont(new Font("Arial",Font.PLAIN, 20));
        piNumberButton.setFocusable(false);
        frame.add(piNumberButton);

        expButton.setBounds(70,325, 60, 40);
        expButton.setFont(new Font("Arial",Font.PLAIN, 20));
        expButton.setFocusable(false);
        frame.add(expButton);

        RTwoButton.setBounds(130,325, 60, 40);
    RTwoButton.setFont(new Font("Arial",Font.PLAIN, 15));
    // show label R2 (keep functionality)
    RTwoButton.setText("R2");
        RTwoButton.setFocusable(false);
        frame.add(RTwoButton);

        RZeroButton.setBounds(190,325, 60, 40);
    RZeroButton.setFont(new Font("Arial",Font.PLAIN, 15));
    // show label R0 (keep functionality)
    RZeroButton.setText("R0");
        RZeroButton.setFocusable(false);
        frame.add(RZeroButton);
        
    
    }

    // --- Helper methods and listeners ---
    private void appendDigit(String d) {
        if (startNewNumber) {
            textField.setText(d);
            startNewNumber = false;
        } else {
            textField.setText(textField.getText() + d);
        }
    }

    private void setOperator(String op) {
        try {
            firstOperand = Double.parseDouble(textField.getText());
        } catch (NumberFormatException e) {
            firstOperand = 0;
        }
        operator = op;
        startNewNumber = true;
    }

    private void calculateResult() {
        double second = 0;
        try {
            second = Double.parseDouble(textField.getText());
        } catch (NumberFormatException e) {
            second = 0;
        }
        double result = 0;
        switch (operator) {
            case "+": result = firstOperand + second; break;
            case "-": result = firstOperand - second; break;
            case "*": result = firstOperand * second; break;
            case "/": result = (second == 0) ? Double.NaN : firstOperand / second; break;
            case "^": result = Math.pow(firstOperand, second); break;
            default: result = second; break;
        }
        textField.setText(formatNumber(result));
        startNewNumber = true;
        operator = "";
    }

    private String formatNumber(double v) {
        if (Double.isNaN(v) || Double.isInfinite(v)) return "Error";
        if (v == (long) v) return String.format("%d", (long) v);
        return String.format("%s", v);
    }

    private void addListeners() {
        // digits
        ActionListener digitListener = e -> appendDigit(((JButton)e.getSource()).getText());
        buttonZero.addActionListener(digitListener);
        buttonOne.addActionListener(digitListener);
        buttonTwo.addActionListener(digitListener);
        buttonThree.addActionListener(digitListener);
        buttonFour.addActionListener(digitListener);
        buttonFive.addActionListener(digitListener);
        buttonSix.addActionListener(digitListener);
        buttonSeven.addActionListener(digitListener);
        buttonEight.addActionListener(digitListener);
        buttonNine.addActionListener(digitListener);

        // dot
        buttonDot.addActionListener(e -> {
            if (startNewNumber) {
                textField.setText("0.");
                startNewNumber = false;
            } else if (!textField.getText().contains(".")) {
                textField.setText(textField.getText() + ".");
            }
        });

        // operators
        buttonPlus.addActionListener(e -> setOperator("+"));
        buttonMinus.addActionListener(e -> setOperator("-"));
        buttonMul.addActionListener(e -> setOperator("*"));
        buttonDiv.addActionListener(e -> setOperator("/"));

        // equals
        buttonEqual.addActionListener(e -> calculateResult());

        // clear
        buttonClear.addActionListener(e -> {
            textField.setText("");
            firstOperand = 0;
            operator = "";
            startNewNumber = true;
        });

        // toggle sign
        toggleSiButton.addActionListener(e -> {
            try {
                double v = Double.parseDouble(textField.getText());
                v = -v;
                textField.setText(formatNumber(v));
            } catch (NumberFormatException ex) { }
        });

        // percent
        percentButton.addActionListener(e -> {
            try {
                double v = Double.parseDouble(textField.getText());
                v = v / 100.0;
                textField.setText(formatNumber(v));
            } catch (NumberFormatException ex) { }
        });

        // memory simple implementation
        mcButton.addActionListener(e -> memory = 0);
        mrButton.addActionListener(e -> textField.setText(formatNumber(memory)));
        mPlusButton.addActionListener(e -> {
            try { memory += Double.parseDouble(textField.getText()); } catch (NumberFormatException ex) {}
        });
        mMinusButton.addActionListener(e -> {
            try { memory -= Double.parseDouble(textField.getText()); } catch (NumberFormatException ex) {}
        });

        // square (x^2)
        RTwoButton.addActionListener(e -> {
            try {
                double v = Double.parseDouble(textField.getText());
                textField.setText(formatNumber(v * v));
                startNewNumber = true;
            } catch (NumberFormatException ex) {}
        });

        // reciprocal (1/x)
        RZeroButton.addActionListener(e -> {
            try {
                double v = Double.parseDouble(textField.getText());
                if (v == 0) textField.setText("Error");
                else textField.setText(formatNumber(1.0 / v));
                startNewNumber = true;
            } catch (NumberFormatException ex) {}
        });

        // pi
        piNumberButton.addActionListener(e -> {
            textField.setText(formatNumber(Math.PI));
            startNewNumber = true;
        });

        // exponent operator: treat as binary operator '^'
        expButton.addActionListener(e -> setOperator("^") );

        // square root
        buttonSqrt.addActionListener(e -> {
            try {
                double v = Double.parseDouble(textField.getText());
                if (v < 0) textField.setText("Error");
                else textField.setText(formatNumber(Math.sqrt(v)));
                startNewNumber = true;
            } catch (NumberFormatException ex) {}
        });
    }


    public static void main(String[] args) {
        // Ensure GUI is created on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> new CalculatorApplication());
    }
    
}