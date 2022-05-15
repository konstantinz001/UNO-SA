var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "30060",
        "ok": "2589",
        "ko": "27471"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "18"
    },
    "maxResponseTime": {
        "total": "13473",
        "ok": "13473",
        "ko": "12007"
    },
    "meanResponseTime": {
        "total": "2147",
        "ok": "2851",
        "ko": "2081"
    },
    "standardDeviation": {
        "total": "1085",
        "ok": "3137",
        "ko": "556"
    },
    "percentiles1": {
        "total": "2035",
        "ok": "1689",
        "ko": "2035"
    },
    "percentiles2": {
        "total": "2047",
        "ok": "5492",
        "ko": "2046"
    },
    "percentiles3": {
        "total": "2129",
        "ok": "8991",
        "ko": "2069"
    },
    "percentiles4": {
        "total": "8040",
        "ok": "10519",
        "ko": "2217"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 942,
    "percentage": 3
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 159,
    "percentage": 1
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 1488,
    "percentage": 5
},
    "group4": {
    "name": "failed",
    "count": 27471,
    "percentage": 91
},
    "meanNumberOfRequestsPerSecond": {
        "total": "423.38",
        "ok": "36.465",
        "ko": "386.915"
    }
},
contents: {
"req_load-ec4d1": {
        type: "REQUEST",
        name: "load",
path: "load",
pathFormatted: "req_load-ec4d1",
stats: {
    "name": "load",
    "numberOfRequests": {
        "total": "15030",
        "ok": "605",
        "ko": "14425"
    },
    "minResponseTime": {
        "total": "17",
        "ok": "17",
        "ko": "18"
    },
    "maxResponseTime": {
        "total": "13473",
        "ok": "13473",
        "ko": "12007"
    },
    "meanResponseTime": {
        "total": "2265",
        "ok": "5720",
        "ko": "2120"
    },
    "standardDeviation": {
        "total": "1220",
        "ok": "3247",
        "ko": "766"
    },
    "percentiles1": {
        "total": "2036",
        "ok": "6436",
        "ko": "2036"
    },
    "percentiles2": {
        "total": "2048",
        "ok": "7996",
        "ko": "2047"
    },
    "percentiles3": {
        "total": "2236",
        "ok": "10105",
        "ko": "2074"
    },
    "percentiles4": {
        "total": "8967",
        "ok": "11473",
        "ko": "7008"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 85,
    "percentage": 1
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 17,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 503,
    "percentage": 3
},
    "group4": {
    "name": "failed",
    "count": 14425,
    "percentage": 96
},
    "meanNumberOfRequestsPerSecond": {
        "total": "211.69",
        "ok": "8.521",
        "ko": "203.169"
    }
}
    },"req_save-43781": {
        type: "REQUEST",
        name: "save",
path: "save",
pathFormatted: "req_save-43781",
stats: {
    "name": "save",
    "numberOfRequests": {
        "total": "15030",
        "ok": "1984",
        "ko": "13046"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "2001"
    },
    "maxResponseTime": {
        "total": "10518",
        "ok": "10518",
        "ko": "2273"
    },
    "meanResponseTime": {
        "total": "2029",
        "ok": "1976",
        "ko": "2038"
    },
    "standardDeviation": {
        "total": "916",
        "ok": "2520",
        "ko": "19"
    },
    "percentiles1": {
        "total": "2034",
        "ok": "1199",
        "ko": "2035"
    },
    "percentiles2": {
        "total": "2046",
        "ok": "2201",
        "ko": "2045"
    },
    "percentiles3": {
        "total": "2108",
        "ok": "7578",
        "ko": "2065"
    },
    "percentiles4": {
        "total": "7002",
        "ok": "9497",
        "ko": "2108"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 857,
    "percentage": 6
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 142,
    "percentage": 1
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 985,
    "percentage": 7
},
    "group4": {
    "name": "failed",
    "count": 13046,
    "percentage": 87
},
    "meanNumberOfRequestsPerSecond": {
        "total": "211.69",
        "ok": "27.944",
        "ko": "183.746"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
