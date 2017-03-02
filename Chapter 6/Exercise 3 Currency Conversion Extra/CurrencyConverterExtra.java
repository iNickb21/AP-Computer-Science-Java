import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.DocumentFilter.FilterBypass;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * Converts USD to EUROS or EUROS to USD and automatically updates as user inputs data.
 * 
 * @author Harold Boyett 
 * @version 3/1/2017
 */


public class CurrencyConverterExtra {
    int focused = 0;
    public CurrencyConverterExtra() {
        createAndShowGui();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CurrencyConverterExtra();
            }
        });
    }

    private void createAndShowGui() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2, 4, 4));

        JLabel ConversionRateLabel = new JLabel("Rate:");
        final JTextField conversionRateTextField = new JTextField();

        JLabel usdLabel = new JLabel("USD");
        final JTextField usdTextField = new JTextField();

        JLabel euroLabel = new JLabel("EUROS");
        final JTextField euroTextField = new JTextField();

        //focus listeners to keep track of which text field is selected
        conversionRateTextField.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
                focused = 0;
            }
            @Override
            public void focusLost(FocusEvent e) {

            }
        });
        usdTextField.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
                focused = 1;
            }
            @Override
            public void focusLost(FocusEvent e) {

            }
        });
        euroTextField.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
                focused = 2;
            }
            @Override
            public void focusLost(FocusEvent e) {

            }
        });
        
        //document filter automatically updates labels as user inputs data. it also checks the user input to only allow numbers and decimals
        DocumentFilter df = new DocumentFilter() {

            @Override
            public void insertString(FilterBypass fb, int i, String string, AttributeSet as) throws BadLocationException {

                if (isDigit(string)) {
                    super.insertString(fb, i, string, as);
                    calcAndSetTotal();
                }
            }

            @Override
            public void remove(FilterBypass fb, int i, int i1) throws BadLocationException {
                super.remove(fb, i, i1);
                calcAndSetTotal();
            }

            @Override
            public void replace(FilterBypass fb, int i, int i1, String string, AttributeSet as) throws BadLocationException {
                if (isDigit(string)) {
                    super.replace(fb, i, i1, string, as);
                    calcAndSetTotal();
                }
            }

            private boolean isDigit(String string) {
                for (int n = 0; n < string.length(); n++) {
                    char c = string.charAt(n); //get a single character of the string

                    if (!Character.isDigit(c) && string.charAt(n) != '.') //only allows numbers and decimals
                        return false;
                }
                return true;
            }

            //updates the labels based on text input
            void calcAndSetTotal() {
                double conversion = 0;
                //usd to euros
                if ((focused == 1 || focused == 0) && !conversionRateTextField.getText().isEmpty() && !usdTextField.getText().isEmpty()) {
                    conversion = Double.parseDouble(usdTextField.getText()) * Double.parseDouble(conversionRateTextField.getText());
                    usdLabel.setText("USD = " + String.valueOf(conversion) + " EUROS");
                }
                
                //euros to usd
                if ((focused == 2 || focused == 0) && !conversionRateTextField.getText().isEmpty() && !euroTextField.getText().isEmpty()) {
                    conversion = Double.parseDouble(euroTextField.getText()) / Double.parseDouble(conversionRateTextField.getText());
                    euroLabel.setText("EUROS = " + String.valueOf(conversion) + " USD");
                }

            }
        };

        //add each textfield to the documement filter
        ((AbstractDocument)(conversionRateTextField.getDocument())).setDocumentFilter(df);
        ((AbstractDocument)(usdTextField.getDocument())).setDocumentFilter(df);
        ((AbstractDocument)(euroTextField.getDocument())).setDocumentFilter(df);

        //add all labels and textfields to the frame
        frame.add(ConversionRateLabel);
        frame.add(conversionRateTextField);
        frame.add(usdTextField);
        frame.add(usdLabel);
        frame.add(euroTextField);
        frame.add(euroLabel);

        frame.pack();
        frame.setVisible(true);
    }
}