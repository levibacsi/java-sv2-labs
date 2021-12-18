package polymorphism.architect;

import java.util.concurrent.Callable;

public class Architect {
    public static void main(String[] args) {
        Plan planSketchPlan = new SketchPlan(2, "Sketch of a plan");
        Plan planPermitPlan = new PermitPlan(3, "Permit a plan", "Johnny", "Budapest");
        Plan planConstructionPlan = new ConstructionPlan(4, "Construction Plan", "Mr. Cons", "City Center", 10);
        SketchPlan sketchPlan = new SketchPlan(4, "Sketch");
        SketchPlan sketchPermit = new PermitPlan(7, "Sketch of permit", "Ben", "London");
        SketchPlan sketchConstruct = new ConstructionPlan(34, "Constuction Sketch", "George", "Washington", 13);
        Header headerPermit = new PermitPlan(7,"Permit with header", "Mrs. Hermit", "Juniper bush");
        Header headerConstr = new ConstructionPlan(546, "Construction w/ header", "Heather", "Lockerby", 69);
        PermitPlan permitPlan = new PermitPlan(7, "Permit my plan at once", "Herr Mitt", "München");
        PermitPlan permCon = new ConstructionPlan(9, "This should be built", "Arnold", "Wien", 987);
        ConstructionPlan constructionPlan = new ConstructionPlan(9, "Construction at its best", "Conor", "Condor", 5);

        System.out.println(planSketchPlan.getPagesOfDocumentation());
        System.out.println(planPermitPlan.getPagesOfDocumentation());
        System.out.println(planConstructionPlan.getPagesOfDocumentation());
        System.out.println(sketchPlan.getTitle() + ": " + sketchPlan.getPagesOfDocumentation());
        System.out.println(sketchPermit.getTitle() + ": " + sketchPermit.getPagesOfDocumentation());
        System.out.println(sketchConstruct.getTitle() + ": " + sketchConstruct.getPagesOfDocumentation());
        System.out.println(headerPermit.getNameOfClient() + ": " + headerPermit.getAddressOfBuilding());
        System.out.println(headerConstr.getNameOfClient() + ": " + headerConstr.getAddressOfBuilding());
        System.out.println(permitPlan.getTitle() + permitPlan.getPagesOfDocumentation() + permitPlan.getHeader() + permitPlan.getNameOfClient() + permitPlan.getAddressOfBuilding());
        System.out.println(permCon.getTitle() + permCon.getPagesOfDocumentation() + permCon.getHeader() + permCon.getNameOfClient() + permCon.getAddressOfBuilding());
        System.out.println(constructionPlan.getTitle() + constructionPlan.pagesOfDocumentation + constructionPlan.getNameOfClient() + constructionPlan.getAddressOfBuilding() + constructionPlan.getSheetsOfConstructionDrawings());
    }
}
