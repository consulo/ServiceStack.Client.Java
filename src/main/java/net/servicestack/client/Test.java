package net.servicestack.client;

/**
 * @author VISTALL
 * @since 24.04.2015
 */
public class Test
{
	public static class A
	{
		public String File;
	}
	public static void main(String[] args)
	{
		JsonServiceClient jsonServiceClient = new JsonServiceClient("http://localhost:41341");
		A a = new A();
		a.File = "Assets/Ball.cs";
		Object o = jsonServiceClient.post("/openfile", a, Object.class);
	}
}
