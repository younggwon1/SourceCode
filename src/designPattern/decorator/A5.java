package designPattern.decorator;

public class A5 extends AudiModelDecorator {

    public A5(ICar audi) {
        super(audi);
        this.modelPrice = 3000;
    }
}