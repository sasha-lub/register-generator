package kh.nure.diploma.form;

public class FieldForm {

    private String name;
    private int size;
    private int lsbPos;
    private AccessRights access;
    private boolean isVolatile;
    private int reset;
    private boolean hasreset;
    private boolean isRand;
    private boolean individuallyAccessible;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getLsbPos() {
        return lsbPos;
    }

    public void setLsbPos(int lsbPos) {
        this.lsbPos = lsbPos;
    }

    public AccessRights getAccess() {
        return access;
    }

    public void setAccess(AccessRights access) {
        this.access = access;
    }

    public boolean isVolatile() {
        return isVolatile;
    }

    public void setVolatile(boolean aVolatile) {
        isVolatile = aVolatile;
    }

    public int getReset() {
        return reset;
    }

    public void setReset(int reset) {
        this.reset = reset;
    }

    public boolean isHasreset() {
        return hasreset;
    }

    public void setHasreset(boolean hasreset) {
        this.hasreset = hasreset;
    }

    public boolean isRand() {
        return isRand;
    }

    public void setRand(boolean rand) {
        isRand = rand;
    }

    public boolean isIndividuallyAccessible() {
        return individuallyAccessible;
    }

    public void setIndividuallyAccessible(boolean individuallyAccessible) {
        this.individuallyAccessible = individuallyAccessible;
    }
}
