package home;

public class BackPropagator {

	final float reward = 0.05f;
	final float punishment = 0.05f;
	//this class take a reward and backpropagates up the tree
	
	//reward
	BackPropagator(A_Star_Path a_star_path, float reward, float punishment)
	{
		System.out.println("BackPropagator:: Running constructor (A_Star_Path a_star_path, float reward, float punishment)");
		reward(a_star_path, reward);
		punishment(a_star_path, punishment);
	}
	
	public void reward(A_Star_Path a_star_path, float reward)
	{
		System.out.println("BackPropagator:: Running reward(A_Star_Path a_star_path, float reward");
		for (Node n : a_star_path.nodesOnPath)
		{
			n.g_of_x -= reward;
		}
	}
	
	public void punishment(A_Star_Path a_star_path, float punishment)
	{
		System.out.println("BackPropagator:: Running punishment(A_Star_Path a_star_Path, float punishment");
		for (Node n : a_star_path.nodesOnPath)
		{
			n.g_of_x += reward;
		}
	}
}
