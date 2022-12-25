import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
class SumTest {
    @ParameterizedTest
    @ValueSource(doubles = { -1, 1, Double.MAX_VALUE, -Double.MAX_VALUE})
    public void Sum_IllegalArgument_ThrowsIllegalArgumentException(double number) {
        int precision = 8;
        Assertions.assertThrows(IllegalArgumentException.class, () -> Sum.Suma(number, precision));
    }

    @ParameterizedTest
    @ValueSource(ints = { -1, 0})
    public void Sum_IllegalPrecision_ThrowsIllegalArgumentException(int precision) {
        double number = 0.5;
        Assertions.assertThrows(IllegalArgumentException.class, () -> Sum.Suma(number, precision));
    }

}
