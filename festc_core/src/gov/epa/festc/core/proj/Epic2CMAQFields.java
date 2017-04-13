package gov.epa.festc.core.proj;

import javax.xml.bind.annotation.XmlRootElement;

import gov.epa.festc.gui.Epic2CMAQPanel;

@XmlRootElement(name = "gov.epa.festc.core.proj.Epic2CMAQFields")
public class Epic2CMAQFields extends DomainFields{
	 
	private String startdate;
	private String enddate;
	 
	private String outfileprefix;
	
	public Epic2CMAQFields() {
		//NOTE: no-op
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	public String getOutfileprefix() {
		return outfileprefix;
	}

	public void setOutfileprefix(String outfileprefix) {
		this.outfileprefix = outfileprefix;
	}

	public void setGridName(String gridName) {
		this.gridName = gridName;
	}

	public String getGridName() {
		return gridName;
	}

	@Override
	public String getName() {
		return Epic2CMAQPanel.class.getCanonicalName();
	}
	
	
}
