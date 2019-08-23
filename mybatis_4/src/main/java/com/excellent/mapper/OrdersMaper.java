package com.excellent.mapper;

import com.excellent.ex.OrdersEx;
import com.excellent.po.Orders;

import java.util.List;

public interface OrdersMaper {

    List<OrdersEx> queryOrderToUser();

    List<Orders> queryOrderToUser2();
}
