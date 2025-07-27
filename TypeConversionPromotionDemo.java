
import java.util.Scanner;
public class TypeConversionPromotionDemo
{
	public static void main(String[] args)
	{
        	Scanner sc = new Scanner(System.in);

		// Step 1: Input for billing
		System.out.print("Enter Quantity (byte): ");
		byte quantity = sc.nextByte();

		System.out.print("Enter Unit Price (int): ");
		int unitPrice = sc.nextInt();

		System.out.print("Enter Tax Rate (in decimal, e.g., 0.18 for 18%): ");
		float taxRate = sc.nextFloat();

		// Type promotion: byte → int → float → double
		int baseAmount = quantity * unitPrice;
		float taxAmount = baseAmount * taxRate;
		double totalAmount = baseAmount + taxAmount;

		// Display bill
		System.out.println("\n----------- Billing Summary -----------");
		System.out.println("Quantity (byte): " + quantity);
		System.out.println("Unit Price (int): Rs." + unitPrice);
		System.out.println("Base Amount (int): Rs." + baseAmount);
		System.out.println("Tax Rate (float): " + taxRate);
		System.out.println("Tax Amount (float): Rs." + taxAmount);
		System.out.println("Total Amount to Pay (double): Rs." + totalAmount);

	        // Step 2: Ask how much USD user will pay for this INR amount
		System.out.print("\nEnter Payment in USD for the above total: ");
		double usdPayment = sc.nextDouble();

		System.out.print("Enter USD to INR Conversion Rate (float): ");
		float conversionRate = sc.nextFloat();

		// Convert USD to INR (explicit cast for demonstration)
		double inrConverted = (float) usdPayment * conversionRate;

	        // Output
		System.out.println("\n----------- USD to INR Conversion -----------");
		System.out.println("Amount Paid in USD: $" + usdPayment);
		System.out.println("Conversion Rate: " + conversionRate);
		System.out.println("Converted Amount in INR: Rs." + inrConverted);

	        //Compare and Print Payment Status
		if (inrConverted >= totalAmount)
		{
			double change = inrConverted - totalAmount;
			System.out.println("Payment is sufficient.");
			System.out.printf("Change to return: Rs.%.2f\n", change);
		}
		else
		{
			double shortage = totalAmount - inrConverted;
			System.out.println("Payment is insufficient.");
			System.out.printf("Additional amount required: Rs.%.2f\n", shortage);
		}
		sc.close();
	}
}