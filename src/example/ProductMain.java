package example;

public class ProductMain {
	public static void main(String[] args)
	{
		Product product=new Product();
		System.out.println(product);
		product.setpId(40);
		product.setpName("mobile");
		System.out.println(product.getpId());
		System.out.println(product.getpName());
	}

}
