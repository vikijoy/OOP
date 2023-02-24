package oop_lesson1;

import java.io.IOException;
import java.util.ArrayList;
import oop_lesson1.GeoTree;
import oop_lesson1.Node;
import oop_lesson1.Person;
import oop_lesson1.Relationship;
import oop_lesson1.Research;
import opp_lesson1.Info;

class GeoTree implements Info {

    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    // связь родитель - ребенок
    public void appendPerentChild(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }

    // связь муж - жена
    public void appendVifeHusbent(Person vife, Person husbent) {
        tree.add(new Node(vife, Relationship.vife, husbent));
        tree.add(new Node(husbent, Relationship.husbent, vife));
    }

    @Override
    public void print(ArrayList<String> PersonArrayList) {
        Info.super.print(PersonArrayList);
    }
}
