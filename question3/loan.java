/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Manoj Nuvvala
 */
public class loan {

    private String loanType;
    private String approvedBy;
    private boolean mortgageOrNot;

    public loan(String loanType, String approvedBy, boolean mortageOrNot) {
        this.loanType = loanType;
        this.approvedBy = approvedBy;
        this.mortgageOrNot = mortageOrNot;
    }

    @Override
    public String toString() {
        return "loan{" + "loanType=" + loanType + ", approvedBy=" + approvedBy + ", mortageOrNot=" + mortgageOrNot + '}';
    }

}
