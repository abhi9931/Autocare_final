package com.autocare.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "WORKSHEET")
public class Worksheet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "worksheetId")
	private int worksheetId;

	@Column(name = "customerId")
	private int customerId;

	@Column(name = "serviceId")
	private int serviceId;

	@Column(name = "completed")
	private boolean completed;

	@Column(name = "locked")
	private boolean locked;

	@Column(name = "unlocked")
	private boolean unlocked;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "brakeId", referencedColumnName = "brakeId")
	Brake brake;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "emmissionId", referencedColumnName = "emmissionId")
	Emission emission;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "engineTuneId", referencedColumnName = "engineTuneId")
	EngineTune engineTune;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "exhaustId", referencedColumnName = "exhaustId")
	Exhaust exhaust;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "interiorId", referencedColumnName = "interiorId")
	Interior interior;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "lightId", referencedColumnName = "lightId")
	Light light;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "roadTestId", referencedColumnName = "roadTestId")
	RoadTest roadTest;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "suspensionId", referencedColumnName = "suspensionId")
	Suspension suspension;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "underBodyId", referencedColumnName = "underBodyId")
	UnderBody underBody;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "underHornestId", referencedColumnName = "underHornestId")
	UnderHornest underHornest;
}
