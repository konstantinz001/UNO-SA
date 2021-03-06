var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "30060",
        "ok": "2456",
        "ko": "27604"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "13"
    },
    "maxResponseTime": {
        "total": "10941",
        "ok": "9523",
        "ko": "10941"
    },
    "meanResponseTime": {
        "total": "2127",
        "ok": "2715",
        "ko": "2074"
    },
    "standardDeviation": {
        "total": "951",
        "ok": "2846",
        "ko": "481"
    },
    "percentiles1": {
        "total": "2036",
        "ok": "1589",
        "ko": "2036"
    },
    "percentiles2": {
        "total": "2048",
        "ok": "5455",
        "ko": "2047"
    },
    "percentiles3": {
        "total": "2074",
        "ok": "7971",
        "ko": "2063"
    },
    "percentiles4": {
        "total": "7221",
        "ok": "9030",
        "ko": "2090"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 948,
    "percentage": 3
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 115,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 1393,
    "percentage": 5
},
    "group4": {
    "name": "failed",
    "count": 27604,
    "percentage": 92
},
    "meanNumberOfRequestsPerSecond": {
        "total": "429.429",
        "ok": "35.086",
        "ko": "394.343"
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
        "ok": "607",
        "ko": "14423"
    },
    "minResponseTime": {
        "total": "13",
        "ok": "13",
        "ko": "13"
    },
    "maxResponseTime": {
        "total": "10941",
        "ok": "9523",
        "ko": "10941"
    },
    "meanResponseTime": {
        "total": "2229",
        "ok": "5101",
        "ko": "2109"
    },
    "standardDeviation": {
        "total": "1059",
        "ok": "2955",
        "ko": "663"
    },
    "percentiles1": {
        "total": "2037",
        "ok": "5982",
        "ko": "2036"
    },
    "percentiles2": {
        "total": "2048",
        "ok": "7452",
        "ko": "2047"
    },
    "percentiles3": {
        "total": "2085",
        "ok": "8925",
        "ko": "2064"
    },
    "percentiles4": {
        "total": "7986",
        "ok": "9438",
        "ko": "6534"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 123,
    "percentage": 1
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 4,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 480,
    "percentage": 3
},
    "group4": {
    "name": "failed",
    "count": 14423,
    "percentage": 96
},
    "meanNumberOfRequestsPerSecond": {
        "total": "214.714",
        "ok": "8.671",
        "ko": "206.043"
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
        "ok": "1849",
        "ko": "13181"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "2000"
    },
    "maxResponseTime": {
        "total": "9494",
        "ok": "9494",
        "ko": "2111"
    },
    "meanResponseTime": {
        "total": "2024",
        "ok": "1932",
        "ko": "2037"
    },
    "standardDeviation": {
        "total": "816",
        "ok": "2325",
        "ko": "14"
    },
    "percentiles1": {
        "total": "2035",
        "ok": "985",
        "ko": "2036"
    },
    "percentiles2": {
        "total": "2047",
        "ok": "3058",
        "ko": "2047"
    },
    "percentiles3": {
        "total": "2070",
        "ok": "6542",
        "ko": "2061"
    },
    "percentiles4": {
        "total": "6053",
        "ok": "7981",
        "ko": "2073"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 825,
    "percentage": 5
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 111,
    "percentage": 1
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 913,
    "percentage": 6
},
    "group4": {
    "name": "failed",
    "count": 13181,
    "percentage": 88
},
    "meanNumberOfRequestsPerSecond": {
        "total": "214.714",
        "ok": "26.414",
        "ko": "188.3"
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
