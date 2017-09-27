package com.ubs.opsit.interviews;

public class MyConverter implements TimeConverter {
	
	
	@Override
	public String convertTime(String aTime) {
		String[] values = aTime.split(":");
		
		int hour = Integer.parseInt(values[0]);
		int minute = Integer.parseInt(values[1]);
		int second = Integer.parseInt(values[2]);
		StringBuilder value = new StringBuilder();
		value.append(getSecondString(second)).append("\n");
		value.append(getRowString(hour/5,4,"R")).append("\n");
		value.append(getRowString(hour%5,4,"R")).append("\n");
		value.append(getRowString(minute/5,11,"Y").replaceAll("YYY","YYR")).append("\n");
		value.append(getRowString(minute%5,4,"Y"));
		return value.toString();
	}
	
	
	protected String getRowString(int rowValue,int maxValue, String colorCode){
		StringBuilder topRowHourString = new StringBuilder();
		for(int i=1; i<=maxValue;i++){
			if(i <=rowValue){
				topRowHourString.append(colorCode);
			}else{
				topRowHourString.append("O");
			}
		}
		return topRowHourString.toString();
	}
	
	protected String getSecondString(int second){
		return second%2 ==0?"Y":"O";
	}

}
