DELETE FROM historical_price;
DELETE FROM stock;
DELETE FROM corporation;

INSERT INTO corporation(id, name, description, incorporation_date, sector, sub_sector)
    VALUES (1, 'San Miguel Corporation', 'San Miguel Corporation (SMC) was originally founded in 1890 as a single-product brewery in the Philippines. The Company has since then transformed itself from a beverage, food and packaging business into fuel and oil, energy, power, infrastructure, telecommunications and banking industries.
The Company''s extensive product portfolio includes beer; liquor; non-alcoholic beverages; poultry; animal feeds; flour, fresh and processed meats; dairy products; coffee; various packaging products; and full range of refined petroleum products.
SMC has strategic partnerships with international companies, among them are Kirin Holdings Company, Limited for beer; Hormel Foods International Corporation for processed meats; Nihon Yamamura Glass Company, Ltd. for packaging products; Padma Fund L.P. for toll roads; and Super Coffee Corporation Pte Ltd for coffee.
The Company''s subsidiaries include San Miguel Brewery, Inc.; Ginebra San Miguel, Inc.; San Miguel Pure Foods Company, Inc.; and Petron Corporation.
Source: SEC Form 17-A (2015)', '1913-08-21','HOLDING_FIRMS', 'HOLDING_FIRMS'),
      (2, 'BDO Unibank, Inc.', 'BDO Unibank Inc. (BDO), originally known as Acme Savings Bank, was acquired by the SM Group in 1976. BDO listed its shares on the Philippine Stock Exchange on May 21, 2002. The Company merged with Equitable PCI Bank in May 2007.
BDO offers a complete array of products and services, i.e. retail banking; lending (corporate, commercial, consumer, and SME); treasury; trust; credit cards; corporate cash management; and remittances. Through its subsidiaries, the Company offers leasing and financing; investment banking; private banking; bancassurance; insurance brokerage; and stock brokerage services.
The Company''s local subsidiaries include BDO Private Bank, Inc.; BDO Leasing and Finance, Inc.; BDO Elite Savings Bank, Inc.; BDO Capital & Investment Corporation; PCIB Securities, Inc.; and BDO Insurance Brokers, Inc. The Company also has foreign subsidiaries in Hong Kong; USA; Europe; Japan; and Canada. The Company''s associates are Manila North Tollways Corporation; SM Keppel Land, Inc.; Generali Pilipinas Holdings, Inc.; Northpine Land Incorporated; and Taal Land, Inc.
As of December 31, 2015, BDO has 1,028 operating domestic branches, one branch in Hong Kong and 3,195 ATMs and 191 cash accept machines.
Source: SEC Form 17-A (2015)', '1968-01-02', 'FINANCIALS','BANKS');