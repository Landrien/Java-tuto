package Exo7;

abstract class ClasseDeBase implements I {
    abstract public void methodeDifferee();


}

class ClasseA extends ClasseDeBase {
    @Override
    public void methode1() {
        System.out.println("ClasseA - méthode 1");
    }

    @Override
    public void methode2() {
        System.out.println("ClasseA - méthode 2");
    }

    // ClasseA ne doit pas implémenter methode3 et methode4
    @Override
    public void methodeDifferee() {
        System.out.println("ClasseA - Méthode différée");
    }

    @Override
    public void methode3() {
        throw new UnsupportedOperationException("ClasseA ne supporte pas methode3");
    }

    @Override
    public void methode4() {
        throw new UnsupportedOperationException("ClasseA ne supporte pas methode4");
    }
}

// ClasseB implémente methode3 et methode4
class ClasseB extends ClasseDeBase {
    @Override
    public void methode3() {
        System.out.println("ClasseB - méthode 3");
    }

    @Override
    public void methode4() {
        System.out.println("ClasseB - méthode 4");
    }

    // ClasseB ne doit pas implémenter methode1 et methode2
    @Override
    public void methodeDifferee() {
        System.out.println("ClasseB - Méthode différée");
    }

    @Override
    public void methode1() {
        throw new UnsupportedOperationException("ClasseB ne supporte pas methode1");
    }

    @Override
    public void methode2() {
        throw new UnsupportedOperationException("ClasseB ne supporte pas methode2");
    }
}