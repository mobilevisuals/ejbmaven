package test;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author eyvind
 */

@Named(value = "calcController")
@SessionScoped
public class CalcController implements Serializable {

    private float a,b,result;


    @EJB
    private calcBeanLocal calcBean;

    /**
     * Creates a new instance of CalcController
     */
    public CalcController() {
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }



    public void add()
    {
        result=calcBean.add(a,b);
        result=calcBean.add(a,b);
    }

}