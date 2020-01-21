package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

    public static void main(String[] args) {
        Rhymersfactory factory = new DefaultRhymersFactory();

        DefaultCountingOutRhymer[] rhymers = testRhymers(factory);

        for (int i = 1; i < 15; i++)
            for (int j = 0; j < 3; j++)
                rhymers[j].countIn(i);

        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < 15; i++)
            rhymers[3].countIn(rn.nextInt(20));

        for (DefaultCountingOutRhymer rhymer : rhymers) {
            while (!rhymer.callCheck())
                System.out.print(rhymer.countOut() + "  ");
            System.out.println();
        }

        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[3]).reportRejected());

    }

    private static DefaultCountingOutRhymer[] testRhymers(Rhymersfactory factory) {
        return new DefaultCountingOutRhymer[]{factory.getStandardRhymer(), factory.getFalseRhymer(),
                    factory.getFIFORhymer(), factory.getHanoiRhymer()};
    }

}