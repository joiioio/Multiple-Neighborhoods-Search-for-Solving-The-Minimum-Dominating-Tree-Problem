import DTPSolver.DTPSolver;
import DTPSolver.Solution;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Main {

    public static ArrayList<String> calibration(){
        var instances = new ArrayList<String>();
        instances.add("instances/Range_100/ins_050_1.txt");
        instances.add("instances/Range_100/ins_100_1.txt");
        instances.add("instances/Range_100/ins_200_1.txt");
        instances.add("instances/Range_100/ins_300_1.txt");
        instances.add("instances/Range_100/ins_400_1.txt");
        instances.add("instances/Range_100/ins_500_1.txt");

        instances.add("instances/Range_125/ins_50_1.txt");
        instances.add("instances/Range_125/ins_100_1.txt");
        instances.add("instances/Range_125/ins_200_1.txt");
        instances.add("instances/Range_125/ins_300_1.txt");
        instances.add("instances/Range_125/ins_400_1.txt");
        instances.add("instances/Range_125/ins_500_1.txt");

        instances.add("instances/Range_150/ins_50_1.txt");
        instances.add("instances/Range_150/ins_100_1.txt");
        instances.add("instances/Range_150/ins_200_1.txt");
        instances.add("instances/Range_150/ins_300_1.txt");
        instances.add("instances/Range_150/ins_400_1.txt");
        instances.add("instances/Range_150/ins_500_1.txt");
        return instances;
    }
    public static ArrayList<String> test(){
        var instances = new ArrayList<String>();
        instances.add("instances/Range_100/ins_050_1.txt");
//        instances.add("instances/Range_100/ins_050_2.txt");
//        instances.add("instances/Range_100/ins_050_3.txt");
        instances.add("instances/Range_100/ins_100_1.txt");
//        instances.add("instances/Range_100/ins_100_2.txt");
//        instances.add("instances/Range_100/ins_100_3.txt");
        instances.add("instances/Range_100/ins_200_1.txt");
//        instances.add("instances/Range_100/ins_200_2.txt");
//        instances.add("instances/Range_100/ins_200_3.txt");
        instances.add("instances/Range_100/ins_300_1.txt");
//        instances.add("instances/Range_100/ins_300_2.txt");
//        instances.add("instances/Range_100/ins_300_3.txt");
        instances.add("instances/Range_100/ins_400_1.txt");
//        instances.add("instances/Range_100/ins_400_2.txt");
//        instances.add("instances/Range_100/ins_400_3.txt");
        instances.add("instances/Range_100/ins_500_1.txt");
//        instances.add("instances/Range_100/ins_500_2.txt");
//        instances.add("instances/Range_100/ins_500_3.txt");
//
        instances.add("instances/Range_125/ins_50_1.txt");
//        instances.add("instances/Range_125/ins_50_2.txt");
//        instances.add("instances/Range_125/ins_50_3.txt");
        instances.add("instances/Range_125/ins_100_1.txt");
//        instances.add("instances/Range_125/ins_100_2.txt");
//        instances.add("instances/Range_125/ins_100_3.txt");
        instances.add("instances/Range_125/ins_200_1.txt");
//        instances.add("instances/Range_125/ins_200_2.txt");
//        instances.add("instances/Range_125/ins_200_3.txt");
        instances.add("instances/Range_125/ins_300_1.txt");
//        instances.add("instances/Range_125/ins_300_2.txt");
//        instances.add("instances/Range_125/ins_300_3.txt");
        instances.add("instances/Range_125/ins_400_1.txt");
//        instances.add("instances/Range_125/ins_400_2.txt");
//        instances.add("instances/Range_125/ins_400_3.txt");
//        instances.add("instances/Range_125/ins_500_1.txt");
//        instances.add("instances/Range_125/ins_500_2.txt");
//        instances.add("instances/Range_125/ins_500_3.txt");
//
//        instances.add("instances/Range_150/ins_50_1.txt");
//        instances.add("instances/Range_150/ins_50_2.txt");
//        instances.add("instances/Range_150/ins_50_3.txt");
//        instances.add("instances/Range_150/ins_100_1.txt");
//        instances.add("instances/Range_150/ins_100_2.txt");
//        instances.add("instances/Range_150/ins_100_3.txt");
//        instances.add("instances/Range_150/ins_200_1.txt");
//        instances.add("instances/Range_150/ins_200_2.txt");
//        instances.add("instances/Range_150/ins_200_3.txt");
//        instances.add("instances/Range_150/ins_300_1.txt");
//        instances.add("instances/Range_150/ins_300_2.txt");
//        instances.add("instances/Range_150/ins_300_3.txt");
//        instances.add("instances/Range_150/ins_400_1.txt");
//        instances.add("instances/Range_150/ins_400_2.txt");
//        instances.add("instances/Range_150/ins_400_3.txt");
//        instances.add("instances/Range_150/ins_500_1.txt");
//        instances.add("instances/Range_150/ins_500_2.txt");
//        instances.add("instances/Range_150/ins_500_3.txt");
        return instances;
    }


    public static void testAll() throws IOException {
        int run = 1;
        var resFile = "D:\\vscode\\MicrosoftVSCode\\code\\n" + //
                "ewDTP1\\resTotal.csv";
        var instances = calibration();
        BufferedWriter bw = new BufferedWriter(new FileWriter(resFile, true));
        bw.write("\ninstance");
        for(var i=0; i<run; ++i){
            bw.write(","+ i + ",v_num,time");
        }
        bw.close();
        for(var instance : instances) {
            bw = new BufferedWriter(new FileWriter(resFile, true));
            bw.write("\n"+instance);
            bw.close();
            for(int i=0; i<run; ++i) {
                DTPSolver solver = new DTPSolver(instance, i,1,1,1);
                var sol = solver.solve();
                bw = new BufferedWriter(new FileWriter(resFile, true));
//                bw.write("," + sol.tree.tree_weight + "," + sol.dominating_set.size() + ","+sol.count+"," + sol.time);
                bw.close();
            }
        }
    }
    public static void main(String[] args) throws IOException {

                System.out.println(args.length);
                int run = 10;
                System.out.println("run is" + run);
                var resFile = "resTotal.csv";
                var instance_file = "D:\\vscode\\MicrosoftVSCode\\code\\newDTP11_实验室\\instances\\RangeL\\Range300_ins_3000_1.txt";

                var time_limit = Double.parseDouble("50");
                BufferedWriter bw = new BufferedWriter(new FileWriter(resFile, true));
                bw.write("\ninstance");
                for (var i = 0; i < run; ++i) {
                    bw.write("," + i + ",v_num,time");
                }
                bw.write("\n" + instance_file);
                bw.close();
                for (int i = 0; i < run; ++i) {
                    DTPSolver solver = new DTPSolver(instance_file, i, 10, 50, 600);
                    solver.setTime_limit(time_limit);
                    var sol = solver.solve();
                    bw = new BufferedWriter(new FileWriter(resFile, true));
                    bw.write("," + sol.start);
                    bw.close();
                }

    }
}
