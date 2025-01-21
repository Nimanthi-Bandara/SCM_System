package com.Project.SCM_System.DTO;

public class OrderStatistics {
    private long totalOrders;
    //private Map<orderStatus, Long> ordersByStatus = new HashMap<>();

    public long gettotalOrders(){
        return totalOrders;
    }

    public void settotalOrders(long totalOrders){
        this.totalOrders = totalOrders;
    }

    /*public Map<orderStatus, Long> getOrdersByStatus() {
    return ordersByStatus;
    }

    public void setOrdersByStatus(Map<orderStatus, Long> ordersByStatus) {
        this.ordersByStatus = ordersByStatus;
    }*/

}
