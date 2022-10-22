package factorstest;

import Factors.ComputeFactors;
import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class ComputeFactorsAfterOptimizeTest {

    @Test
    public void testComputeFactors1() {
        Long number = (long)2;
        ComputeFactors factors = new ComputeFactors(number);
        factors.computeFactorOptimize();
        ArrayList<Long> factorsArray = new ArrayList<>();
        factorsArray.add((long)1);
        factorsArray.add((long)2);
        assertThat(factors.getFactors()).isEqualTo(factorsArray);
    }

    @Test
    public void testComputeFactors2() {
        Long number = (long)42;
        ComputeFactors factors = new ComputeFactors(number);
        factors.computeFactorOptimize();
        ArrayList<Long> factorsArray = new ArrayList<>();
        factorsArray.add((long)1);
        factorsArray.add((long)2);
        factorsArray.add((long)3);
        factorsArray.add((long)6);
        factorsArray.add((long)7);
        factorsArray.add((long)14);
        factorsArray.add((long)21);
        factorsArray.add((long)42);
        assertThat(factors.getFactors()).isEqualTo(factorsArray);
    }

    @Test
    public void testComputeFactors3() {
        Long number = (long)-42;
        ComputeFactors factors = new ComputeFactors(number);
        factors.computeFactorOptimize();
        ArrayList<Long> factorsArray = new ArrayList<>();
        assertThat(factors.getFactors()).isEqualTo(factorsArray);
    }

    @Test
    public void testComputeFactors4() {
        Long number = Long.parseLong("a");
        ComputeFactors factors = new ComputeFactors(number);
        factors.computeFactorOptimize();
        ArrayList<Long> factorsArray = new ArrayList<>();
        assertThat(factors.getFactors()).isEqualTo(factorsArray);
    }

}
