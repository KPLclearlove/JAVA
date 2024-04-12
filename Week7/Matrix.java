package Week7;

public class Matrix {
    private double[][] values;
    private double[][] valuesT;
    private int nrows, ncols;

    public Matrix(int nrows, int ncols) {
        this.nrows = nrows;
        this.ncols = ncols;
        this.values = new double[nrows][ncols];
    }

    public Matrix(double[][] values) {
        this.nrows = values.length;
        this.ncols = values[0].length;
        this.values = values;
    }

    public Matrix add(Matrix mat) {
        if (nrows != mat.nrows || ncols != mat.ncols) {
            return null;
        }

        double[][] newValues = new double[nrows][ncols];
        for (int i = 0; i < nrows; i++) {
            for (int j = 0; j < ncols; j++) {
                newValues[i][j] = values[i][j] + mat.values[i][j];
            }
        }

        return (new Matrix(newValues));
    }

    public Matrix substract(Matrix mat) {
        if (nrows != mat.nrows || ncols != mat.ncols) {
            return null;
        }

        double[][] newValues = new double[nrows][ncols];
        for (int i = 0; i < nrows; i++) {
            for (int j = 0; j < ncols; j++) {
                newValues[i][j] = values[i][j] - mat.values[i][j];
            }
        }

        return (new Matrix(newValues));
    }

    public Matrix multiplicate(Matrix mat) {
        if (ncols != mat.nrows) {
            return null;
        }

        double[][] newValues = new double[nrows][mat.ncols];
        for (int i = 0; i < nrows; i++) {
            for (int j = 0; j < mat.ncols; j++) {
                double sum = 0;
                for (int k = 0; k < ncols; k++) {
                    sum += values[i][k] * mat.values[k][j];
                }
                newValues[i][j] = sum;
            }
        }

        return (new Matrix(newValues));
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nrows; i++) {
            for (int j = 0; j < ncols; j++) {
                sb.append("\t" + values[i][j]);
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public Matrix turnMat(){
        this.nrows = ncols;
        this.ncols = nrows;
        this.valuesT = new double[this.ncols][this.nrows];
        for(int i = 0; i < nrows; i++){
            for(int j =0; j < ncols; j++){
                valuesT[i][j] = values[j][i];
            }
        }

        return (new Matrix(valuesT));
    }

    public double[] getrow(int row){
        double[] tem = new double[ncols];
        for(int i = 0; i < ncols; i++){
            tem[i] = values[row][i];
        }

        return (tem);
    }
}
