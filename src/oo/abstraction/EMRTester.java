package oo.abstraction;

public class EMRTester {

	public static void main(String[] args) {
		EMR e1 = new EMR("A123456789", "測試人員1", 'M', 20010101);
		EMR e2 = new EMR("B123456789", "測試人員2", 'F', 20010202);
		EMR e3 = new EMR("C123456789", "測試人員3", 'M', 20010303);
		EMR e4 = new EMR("D123456789", "測試人員4", 'F', 20010404);
		EMR e5 = new EMR("E123456789", "測試人員5", 'M', 20010505);
		
		EMR[] emrs = new EMR[5];
		emrs[0] = new EMR("A123456789", "測試人員1", 'M', 20010101);
		emrs[1] = new EMR("B123456789", "測試人員2", 'F', 20010202);
		emrs[2] = new EMR("C123456789", "測試人員3", 'M', 20010303);
		emrs[3] = new EMR("D123456789", "測試人員4", 'F', 20010404);
		emrs[4] = new EMR("E123456789", "測試人員5", 'M', 20010505);
		emrs[0].ChartNumber = 00000001;
		emrs[1].ChartNumber = 00000002;
		emrs[2].ChartNumber = 00000003;
		emrs[3].ChartNumber = 00000004;
		emrs[4].ChartNumber = 00000005;
	}

}
