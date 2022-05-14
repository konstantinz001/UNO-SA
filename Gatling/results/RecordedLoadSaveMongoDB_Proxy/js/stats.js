var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "40064",
        "ok": "7947",
        "ko": "32117"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "11"
    },
    "maxResponseTime": {
        "total": "35842",
        "ok": "35842",
        "ko": "35621"
    },
    "meanResponseTime": {
        "total": "1927",
        "ok": "1645",
        "ko": "1997"
    },
    "standardDeviation": {
        "total": "2024",
        "ok": "4254",
        "ko": "780"
    },
    "percentiles1": {
        "total": "2018",
        "ok": "13",
        "ko": "2020"
    },
    "percentiles2": {
        "total": "2031",
        "ok": "1088",
        "ko": "2031"
    },
    "percentiles3": {
        "total": "2344",
        "ok": "7915",
        "ko": "2125"
    },
    "percentiles4": {
        "total": "8008",
        "ok": "28605",
        "ko": "2489"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 5544,
    "percentage": 14
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 467,
    "percentage": 1
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 1936,
    "percentage": 5
},
    "group4": {
    "name": "failed",
    "count": 32117,
    "percentage": 80
},
    "meanNumberOfRequestsPerSecond": {
        "total": "99.168",
        "ok": "19.671",
        "ko": "79.498"
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
        "total": "20032",
        "ok": "2481",
        "ko": "17551"
    },
    "minResponseTime": {
        "total": "11",
        "ok": "11",
        "ko": "11"
    },
    "maxResponseTime": {
        "total": "35842",
        "ok": "35842",
        "ko": "35621"
    },
    "meanResponseTime": {
        "total": "2155",
        "ok": "3425",
        "ko": "1976"
    },
    "standardDeviation": {
        "total": "2571",
        "ok": "6610",
        "ko": "1054"
    },
    "percentiles1": {
        "total": "2019",
        "ok": "16",
        "ko": "2020"
    },
    "percentiles2": {
        "total": "2032",
        "ok": "5193",
        "ko": "2032"
    },
    "percentiles3": {
        "total": "3530",
        "ok": "14999",
        "ko": "2256"
    },
    "percentiles4": {
        "total": "9340",
        "ok": "33833",
        "ko": "5993"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1436,
    "percentage": 7
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 11,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 1034,
    "percentage": 5
},
    "group4": {
    "name": "failed",
    "count": 17551,
    "percentage": 88
},
    "meanNumberOfRequestsPerSecond": {
        "total": "49.584",
        "ok": "6.141",
        "ko": "43.443"
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
        "total": "20032",
        "ok": "5466",
        "ko": "14566"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "2000"
    },
    "maxResponseTime": {
        "total": "29918",
        "ok": "29918",
        "ko": "2188"
    },
    "meanResponseTime": {
        "total": "1699",
        "ok": "836",
        "ko": "2023"
    },
    "standardDeviation": {
        "total": "1215",
        "ok": "2095",
        "ko": "12"
    },
    "percentiles1": {
        "total": "2017",
        "ok": "2",
        "ko": "2020"
    },
    "percentiles2": {
        "total": "2027",
        "ok": "741",
        "ko": "2031"
    },
    "percentiles3": {
        "total": "2050",
        "ok": "6008",
        "ko": "2047"
    },
    "percentiles4": {
        "total": "6525",
        "ok": "8024",
        "ko": "2063"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 4108,
    "percentage": 21
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 456,
    "percentage": 2
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 902,
    "percentage": 5
},
    "group4": {
    "name": "failed",
    "count": 14566,
    "percentage": 73
},
    "meanNumberOfRequestsPerSecond": {
        "total": "49.584",
        "ok": "13.53",
        "ko": "36.054"
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
