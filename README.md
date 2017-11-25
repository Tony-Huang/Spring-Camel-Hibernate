# Spring-Camel-Hibernate

Spring , camel, hibernate related tech demo

# get HttpServletRequest or HttpServletResponse

Need to use Camel conversion system. such as:

   HttpServletRequest request = exchange.getIn().getBody(HttpServletRequest.class);

   HttpServletResponse response = exchange.getIn().getBody(HttpServletResponse.class);

