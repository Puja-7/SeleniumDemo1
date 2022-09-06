package Day47_Collection2;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

import javax.print.attribute.standard.PrinterLocation;

public class Example1 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		List l=new ArrayList();
		PriorityQueue p=new PriorityQueue();
		p.add(12);
		p.add(123);
		p.add(78);
		p.add(34);
		p.add(0);
		p.add(-8);
		p.add(123);
		System.out.println(p);
		System.out.println("Use of p.element()"+p.element());
		System.out.println("p.peek()"+p.peek());
		System.out.println("p.remove()"+p.remove());
		System.out.println(p);
		System.out.println("p.poll()"+p.poll());
		System.out.println(p);
		PriorityQueue pq=new PriorityQueue();
		
	//	System.out.println("pq.element()"+pq.element());
	//	System.out.println(pq.peek());
	//	System.out.println(pq.poll());
		
		try
		{System.out.println(pq.remove());
		}catch(NoSuchElementException e)
		{
			System.out.println(e+ " There is no element in Queue");
			
		}
		}
	}


