public class TagObjectAdapter implements TagAdapter{

    private Tag t = new Tag();

    @Override
    public Price get10Price() {
        return t.getPrice();
    }

    @Override
    public Price get20Price() {
        return t.getPrice();
    }


    @Override
    public Price get30Price() { return t.getPrice();
    }
}
