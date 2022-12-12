package bsuir.VT.Shamko.specification.room;

import bsuir.VT.Shamko.specification.Specification;

import java.util.Collections;
import java.util.List;

public class FindFree implements Specification {

    public FindFree() {
    }

    @Override
    public String toSql() {
        return "WHERE occupied = 'false'";
    }

    @Override
    public List<Object> getParameters() {
        return Collections.emptyList();
    }
}
