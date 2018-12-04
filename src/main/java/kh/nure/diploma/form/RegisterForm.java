package kh.nure.diploma.form;

import java.util.List;

public class RegisterForm {

    private String name;
    private List<FieldForm> fields;
    private int size;
    private CoverageMode coverageMode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FieldForm> getFields() {
        return fields;
    }

    public void setFields(List<FieldForm> fields) {
        this.fields = fields;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public CoverageMode getCoverageMode() {
        return coverageMode;
    }

    public void setCoverageMode(CoverageMode coverageMode) {
        this.coverageMode = coverageMode;
    }
}
