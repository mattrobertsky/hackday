package hello;

public class Result {

    private final Integer apps;
    private final Integer macs;
    private final Float costPerMac;
    private final Float costPerApp;
    private final Float totalMac;
    private final Float totalApp;
    private final Float total;

    Result(Integer apps, Integer macs, Float costPerMac, Float costPerApp, Float totalMac, Float totalApp, Float total) {
        this.apps = apps;
        this.macs = macs;
        this.costPerApp = costPerApp;
        this.costPerMac = costPerMac;
        this.totalMac = totalMac;
        this.totalApp = totalApp;
        this.total = total;

    }

    public Integer getApps() {
        return apps;
    }

    public Integer getMacs() {
        return macs;
    }

    public Float getTotalApp() {
        return totalApp;
    }

    public Float getCostPerApp() {
        return costPerApp;

    }

    public Float getTotal() {
        return total;
    }

    public Float getCostPerMac() {
        return costPerMac;
    }

    public Float getTotalMac() {
        return totalMac;
    }

}
