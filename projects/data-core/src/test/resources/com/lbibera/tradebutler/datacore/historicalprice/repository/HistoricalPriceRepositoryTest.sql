DELETE FROM historical_price;
DELETE FROM stock;
DELETE FROM corporation;

INSERT INTO corporation(id, name, description, incorporation_date, sector, sub_sector) VALUES
  (1, 'San Miguel Corporation', 'San Miguel Corporation (SMC) was originally founded in 1890 as a single-product brewery in the Philippines. The Company has since then transformed itself from a beverage, food and packaging business into fuel and oil, energy, power, infrastructure, telecommunications and banking industries.
The Company''s extensive product portfolio includes beer; liquor; non-alcoholic beverages; poultry; animal feeds; flour, fresh and processed meats; dairy products; coffee; various packaging products; and full range of refined petroleum products.
SMC has strategic partnerships with international companies, among them are Kirin Holdings Company, Limited for beer; Hormel Foods International Corporation for processed meats; Nihon Yamamura Glass Company, Ltd. for packaging products; Padma Fund L.P. for toll roads; and Super Coffee Corporation Pte Ltd for coffee.
The Company''s subsidiaries include San Miguel Brewery, Inc.; Ginebra San Miguel, Inc.; San Miguel Pure Foods Company, Inc.; and Petron Corporation.
Source: SEC Form 17-A (2015)', '1913-08-21','HOLDING_FIRMS', 'HOLDING_FIRMS')
;

INSERT INTO stock(id, corporation_id, isin, issue_type, status, sort_order, name, symbol, listing_date, board_lot, par_value, foreign_ownership_limit) VALUES
  (1, 1, 'PHY751061151', 'COMMON', 'OPEN', 1, 'San Miguel Corporation', 'SMC', '1948-11-05', 10, 5.00, 40.00),
  (2, 1, 'PHY751061649', 'PREFERRED', 'OPEN', 2, 'San Miguel Corporation Preferred Shares 2D', 'SMC2D', '2015-09-21', 10, 5.00, 40.00)
;

INSERT INTO historical_price(id, stock_id, date, change, close, high, low, open, prev, price, value, volume) VALUES
  (1, 1, '2017-04-12', -0.19, 107.80, 108.00, 107.60, 108.00, 108.00, 107.88, 16275925.00, 150870),
  (2, 1, '2017-04-11', 0.18, 108.00, 108.70, 105.50, 106.20, 108.00, 107.88, 16275925.00, 150870),
  (3, 1, '2017-04-10', 0.01, 106.10, 106.90, 106.00, 106.00, 108.00, 107.88, 16275925.00, 150870),
  (4, 1, '2017-04-07', -0.10, 105.33, 107.00, 103.00, 104.00, 108.00, 107.88, 16275925.00, 150870),
  (5, 1, '2017-04-06', 0.19, 104.18, 106.00, 103.10, 104.90, 108.00, 107.88, 16275925.00, 150870)
;