import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    int num1, num2;
    double quotient, power;

    num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro:"));
    num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro:"));

    quotient = (double) num1 / num2;
    power = Math.pow(num1, num2);

    String mensagem = "Quociente da divisão: " + quotient + "\n";
    mensagem += "Potência: " + power;

    JOptionPane.showMessageDialog(null, mensagem);
  }

}
