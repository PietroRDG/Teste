import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, BigDecimal> faturamento = new HashMap<>();
        faturamento.put("SP", BigDecimal.valueOf(67836.43));
        faturamento.put("RJ", BigDecimal.valueOf(36678.66));
        faturamento.put("MG", BigDecimal.valueOf(29229.88));
        faturamento.put("ES", BigDecimal.valueOf(27165.48));
        faturamento.put("Outros", BigDecimal.valueOf(19849.53));

        BigDecimal total = BigDecimal.ZERO;
        for (BigDecimal valor : faturamento.values()) {
            total = total.add(valor);
        }

        System.out.println("Percentual por estado:");
        for (Map.Entry<String, BigDecimal> entry : faturamento.entrySet()) {
            String estado = entry.getKey();
            BigDecimal valor = entry.getValue();

            BigDecimal percentual = valor.divide(total, 10, RoundingMode.HALF_UP)
                    .multiply(BigDecimal.valueOf(100));

            System.out.printf("%s: %.2f%%\n", estado, percentual);
        }
    }
}