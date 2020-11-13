package ru.homeless;

@Singleton
@Deprecated
public class RecommendatorImpl implements Recommendator {
    @InjectProperty
    private String alcohol;

    @Override
    public void recommend() {
        System.out.println("to protect from covid-19 drink "+ alcohol);
    }
}
