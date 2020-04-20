# e-Healthify
App developed for Hack-the-Crisis India.
# App Features
* The objective of this system is to predict the probability of a person getting infected by COVID-19.
* To predict the probability, various parameters are taken into consideration. 
* These parameters were identified with combined efforts of experts of the healthcare industry and various government bodies.

 **These parameters include:** \
 i.          Place\
 ii.          Gender\
 iii.          Occupation\
 iv.          Mode of usual transport\
 v.          Number of confirmed cases per 1 million population in that region\
vi.          Number of Death case per 1 million population in that region\
 vii.          Presence of one or more additional medical conditions co-occurring with a primary condition [Hypertension/diabetes/coronary heart disease]\
 viii.          Age of the person\
ix.          Neurological coma score\
x.          Pulmonary PaO2 (mmHg)/FiO2\
xi.          Cardiological Mean systolic Arterial pressure (mmHg)\
xii.          Diuresis in mL/Day\
 xiii.       Haematological Platelets 10/L\
xiv.          Hepatic Blood bilirubin (µmol/L)\
 xv.          D-dimer concentration in the blood (ng/ml)\
xvi.          Number of times a person's heart beats per minute\
xvii.          High-density lipoprotein level (milligrams per decilitre)\
xviii.          One-year mortality for a patient who may have a range of comorbid conditions, such as heart disease, AIDS, or cancer\
xix.          Concentration of glucose present in the blood (millimoles per litre)\
xx.          Average number of foreign trips taken by the person per month, considering last 2 years data

* Data of these parameters and the probability of them being affected, of more than 10,000 people is collected.
* Using this data, an ANN prediction model is built which can predict the probability of a person getting affected by the CoronaVirus.
* As the testing procedures for the virus take a lot of time and the testing kits are available in limited supply, this algorithm can be used by the local doctors to predict the probability.
* The input parameters of the algorithm are given as input by the local doctor/physician or medical camps setup by Health Organisations to give a probability score of the patient.
* If the probability of the infection is high, then the patient is kept under isolation and sent for further testing and screening
