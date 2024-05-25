package model;

public class Project extends LesEenheid {

    double productCijfer;
    double procesCijfer;
    double methodenEnTechniekCijfer;
    private static double DEFAULT_CIJFER = -1;
    private static double ONDERGRENS_VOLDOENDE = 5.5;

    public Project (double productCijfer, double procesCijfer, double methodenEnTechniekCijfer, String naam, int ects, int studiejaar) {
        super(naam, ects, studiejaar);
        this.productCijfer = productCijfer;
        this.procesCijfer = procesCijfer;
        this.methodenEnTechniekCijfer = methodenEnTechniekCijfer;
    }

    public Project (String naam, int ects, int studiejaar) {
        this (DEFAULT_CIJFER, DEFAULT_CIJFER, DEFAULT_CIJFER, naam, ects, studiejaar);
    }

    public boolean isAfgerond() {
        boolean isAfgerond = false;
        if (getProcesCijfer() >= ONDERGRENS_VOLDOENDE && getProductCijfer() >= ONDERGRENS_VOLDOENDE && getMethodenEnTechniekCijfer() >= ONDERGRENS_VOLDOENDE) {
            isAfgerond = true;
        }
        return isAfgerond;
    }


    @Override
    public String toString() {
        return super.toString() + "(" + productCijfer + ", " + procesCijfer + ", " + methodenEnTechniekCijfer + ")";
    }

    public double getProductCijfer() {
        return productCijfer;
    }

    public void setProductCijfer(double productCijfer) {
        this.productCijfer = productCijfer;
    }

    public double getProcesCijfer() {
        return procesCijfer;
    }

    public void setProcesCijfer(double procesCijfer) {
        this.procesCijfer = procesCijfer;
    }

    public double getMethodenEnTechniekCijfer() {
        return methodenEnTechniekCijfer;
    }

    public void setMethodenEnTechniekCijfer(double methodenEnTechniekCijfer) {
        this.methodenEnTechniekCijfer = methodenEnTechniekCijfer;
    }
}
