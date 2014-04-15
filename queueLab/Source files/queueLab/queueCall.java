/**
 * Name: Russell Tan
 * Class: CECS 274
 * Description: This is the calling program for the queue store class
 */

package queueLab;

public class queueCall
{
	public static void main(String args[])
	{
		queueStore store = new queueStore();
		
		store.populateStores();
		store.checkoutGuests();
	}
}
