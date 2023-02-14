package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus_2;

public class Order_2 {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date moment;
	private OrderStatus_2 status;
	
	private Client_2 client;
	
	private List<OrderItem_2> items = new ArrayList<OrderItem_2>();
	
	public Order_2() {
		
		
	}

	public Order_2(Date moment, OrderStatus_2 status, Client_2 client) {
		super();
		this.moment = moment;
		this.status = status;
		this.client = client;
		
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus_2 getStatus() {
		return status;
	}

	public void setStatus(OrderStatus_2 status) {
		this.status = status;
	}

	public Client_2 getClient() {
		return client;
	}

	public void setClient(Client_2 client) {
		this.client = client;
	}

	public void addItem(OrderItem_2 item) {
		
		items.add(item);
		
	}
	
	public void removeItem(OrderItem_2 item) {
		
		items.remove(item);
		
	}
	
	

	public double total() {
		
		double sum = 0.0;
		for(OrderItem_2 it: items) {
			
			sum += it.subTotal();
			
		}
		
		return sum;
		
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		
		for(OrderItem_2 item : items) {
			
			sb.append(item + "\n");
			
		}
		
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
		
	}
	
	
	
	
	
}
